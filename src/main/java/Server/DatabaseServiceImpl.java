package Server;


import DAOs.AktieImpl;
import DAOs.BrugerImpl;
import GRPC.bruger.Bruger;
import GRPC.bruger.*;
import io.grpc.stub.StreamObserver;

public class DatabaseServiceImpl extends BrugerServiceGrpc.BrugerServiceImplBase {

    private BrugerImpl brugerDAO;
    private AktieImpl aktieDAO;
   public DatabaseServiceImpl(){
       this.brugerDAO = new BrugerImpl();
       this.aktieDAO = new AktieImpl();
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
            double value = request.getAntal() * aktieDAO.getAktie(request.getAktie(0).getNavn()).getHigh();
            AktieResponse aktieResponse = AktieResponse.newBuilder()
                   .setResponse(String.valueOf(value))
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
