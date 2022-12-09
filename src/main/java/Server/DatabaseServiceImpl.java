package Server;


import DAOs.AktieImpl;
import DAOs.BrugerImpl;
import DAOs.DepotImpl;
import DAOs.TransaktionImpl;
import GRPC.bruger.Bruger;
import GRPC.bruger.*;
import io.grpc.stub.StreamObserver;

import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DatabaseServiceImpl extends BrugerServiceGrpc.BrugerServiceImplBase {

    private BrugerImpl brugerDAO;
    private AktieImpl aktieDAO;
    private DepotImpl depotDAO;
    private TransaktionImpl transDAO;
   public DatabaseServiceImpl(){
       this.brugerDAO = new BrugerImpl();
       this.aktieDAO = new AktieImpl();
       this.depotDAO = new DepotImpl();
       this.transDAO = new TransaktionImpl();
   }
    @Override
    public void createBruger(Bruger request,
                      StreamObserver<BrugerResponse> responseObserver) {
       boolean responsebool;
        System.out.println("yoooooooo");
        System.out.println(request.getUsername());
        if(brugerDAO.create(request.getUsername(), request.getPassword(), request.getDepotID(), request.getSaldo())){
            System.out.println("Created");
            responsebool = true;
        }
        else {
            responsebool = false;
        }
        BrugerResponse response = BrugerResponse.newBuilder()
                .setResponse(responsebool)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

   @Override
    public void getBruger(BrugerRequest brugerRequest, StreamObserver<Bruger> streamObserver){
       DTOs.Bruger bruger = brugerDAO.getUser(brugerRequest.getBruger(0).getUsername());
       System.out.println(bruger.getUsername());
       System.out.println(brugerRequest.getParam());
       Bruger bruger1 = Bruger.newBuilder().
               setUsername(bruger.getUsername()).
               setPassword(bruger.getPassword()).
               setDepotID(bruger.getDepotId()).
               setSaldo(bruger.getSaldo())
               .build();
       streamObserver.onNext(bruger1);
       streamObserver.onCompleted();
   }
    @Override
    public void handleAktie(AktieRequest request, StreamObserver<AktieResponse> streamObserver){
       if(request.getParam().equals("buy")){
           System.out.println("Buying");
            double købspris = request.getAntal() * aktieDAO.getAktie(request.getAktie(0).getNavn()).getHigh();
            depotDAO.createDepotEntry(request.getDepotID(), request.getAktie(0).getNavn(), request.getAntal(), købspris);
            transDAO.createTransaktion(request.getDepotID(), brugerDAO.getUser(request.getDepotID()), request.getAktie(0).getNavn(), request.getAntal(), new Date(System.currentTimeMillis()));
            brugerDAO.buyAktie(købspris, request.getDepotID());

            AktieResponse aktieResponse = AktieResponse.newBuilder()
                   .setResponse(request.getAntal() + " " + request.getAktie(0).getFirma() + " aktier købt til pris: " + købspris)
                   .build();
           streamObserver.onNext(aktieResponse);
           streamObserver.onCompleted();
       }
       else if(request.getParam().equals("sell")) {
           System.out.println("Selling");
           double value = request.getAntal() * aktieDAO.getAktie(request.getAktie(0).getNavn()).getLow();
           AktieResponse aktieResponse = AktieResponse.newBuilder()
                   .setResponse(String.valueOf(value))
                   .build();
           streamObserver.onNext(aktieResponse);
           streamObserver.onCompleted();
       }
       else if(request.getParam().equals("update")){
           System.out.println("Updating");
            aktieDAO.updateAktie(request.getAktie(0).getNavn(), request.getAktie(0).getPris(), request.getAktie(0).getHigh(), request.getAktie(0).getLow());
           System.out.println(request.getAktie(0).getNavn());
           System.out.println(request.getAktie(0).getPris());
           System.out.println(request.getAktie(0).getFirma());
           System.out.println(request.getAktie(0).getHigh());
           System.out.println(request.getAktie(0).getLow());
           AktieResponse aktieResponse = AktieResponse.newBuilder()
                   .setResponse("updated: " + request.getAktie(0).getNavn())
                   .build();
           streamObserver.onNext(aktieResponse);
           streamObserver.onCompleted();
       }
    }

    @Override
    public void getAktie (AktieName name, StreamObserver<Aktie> streamObserver){
        DTOs.Aktie aktie = aktieDAO.getAktie(name.getName());
        Aktie responseAktie = Aktie.newBuilder()
                .setNavn(aktie.getNavn())
                .setPris(aktie.getPris())
                .setFirma(aktie.getFirma())
                .setHigh(aktie.getHigh())
                .setLow(aktie.getLow())
                .build();
        streamObserver.onNext(responseAktie);
        streamObserver.onCompleted();
    }

    @Override
    public void getAll(getAllAktier request, StreamObserver<allAktier> streamObserver){
        List<DTOs.Aktie> aktier = aktieDAO.getAll();
        List<Aktie> tempList = new ArrayList<>();

        for (int i = 0; i < aktier.size(); i++) {
            Aktie tempaktie = Aktie.newBuilder()
                    .setNavn(aktier.get(i).getNavn())
                    .setFirma(aktier.get(i).getFirma())
                    .setPris(aktier.get(i).getPris())
                    .setHigh(aktier.get(i).getHigh())
                    .setLow(aktier.get(i).getLow())
                    .build();
            tempList.add(tempaktie);
        }
        allAktier allAktier = GRPC.bruger.allAktier.newBuilder().addAllAktier(tempList).build();
        System.out.println(allAktier.toString());
        streamObserver.onNext(allAktier);
        streamObserver.onCompleted();
    }

/* @Override
   public void getUser(Bruger request,
                        StreamObserver<Bruger> responseObserver) {
      try{
          String User = request.getUsername();


                  Bruger response = Bruger.newBuilder().setUsername(User).build();

     responseObserver.onNext(response);
     responseObserver.onCompleted();
      } catch (Exception e) {
          throw new RuntimeException(e);
      }


    }

 */

    /*@Override
    public void createUser(Bruger bruger, StreamObserver<Bruger> responseObserver) {
        try{


            Bruger response = Bruger.newBuilder().setUsername("Jens").setPassword("Herskab69").setDepotID(1).setSaldo(69).build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
*/

}
