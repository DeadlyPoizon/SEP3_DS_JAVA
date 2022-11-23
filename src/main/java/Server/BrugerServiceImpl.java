package Server;


import DAOs.BrugerImpl;
import DAOs.Interfaces.BrugerDAO;
import GRPC.bruger.Bruger;
import GRPC.bruger.*;
import db.DBHelper;
import db.DataMapper;
import io.grpc.stub.StreamObserver;

public class BrugerServiceImpl extends BrugerServiceGrpc.BrugerServiceImplBase {

    private BrugerImpl dao;
   public BrugerServiceImpl(){
       this.dao = new BrugerImpl();
   }
    @Override
    public void createBruger(Bruger request,
                      StreamObserver<BrugerResponse> responseObserver) {
       boolean responsebool;
        System.out.println("yoooooooo");
        System.out.println(request.getUsername());
        if(dao.create(request.getUsername(), request.getPassword(), request.getDepotID(), request.getSaldo())){
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
       DTOs.Bruger bruger = dao.getUser(brugerRequest.getUsername());
       System.out.println(bruger.getUsername());
       Bruger bruger1 = Bruger.newBuilder().
               setUsername(bruger.getUsername()).
               setPassword(bruger.getPassword()).
               setDepotID(bruger.getDepotId()).
               setSaldo(bruger.getSaldo())
               .build();
       streamObserver.onNext(bruger1);
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
