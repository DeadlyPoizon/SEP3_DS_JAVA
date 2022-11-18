package Server;


import DAOs.BrugerImpl;
import DAOs.Interfaces.BrugerDAO;
import GRPC.bruger.Bruger;
import GRPC.bruger.HelloRequest;
import GRPC.bruger.HelloResponse;
import GRPC.bruger.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;

public class BrugerServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {

    private BrugerImpl dao;

   public BrugerServiceImpl(){
       this.dao = new BrugerImpl();
   }
    @Override
    public void hello(HelloRequest request,
                      StreamObserver<HelloResponse> responseObserver) {
        System.out.println("yoooooooo");
        System.out.println(request.getFirstName());
        String greeting = String.format("Hello, %s %s!",
                request.getFirstName(),
                request.getLastName());
        HelloResponse response = HelloResponse.newBuilder()
                .setGreeting(greeting)
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
