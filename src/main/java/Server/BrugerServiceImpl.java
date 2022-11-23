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
    private DBHelper dbHelper;

   public BrugerServiceImpl(){
       this.dao = new BrugerImpl();
   }
    @Override
    public void createBruger(Bruger request,
                      StreamObserver<BrugerResponse> responseObserver) {
        System.out.println("yoooooooo");
        System.out.println(request.getUsername());
        BrugerResponse response = BrugerResponse.newBuilder()
                .setResponse(true)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
/*
   @Override
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
