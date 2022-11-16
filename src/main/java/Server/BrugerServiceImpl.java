package Server;


import DAOs.BrugerImpl;
import DAOs.Interfaces.BrugerDAO;
import bruger.Bruger;
import bruger.BrugerRequest;
import bruger.UserGrpc;
import io.grpc.stub.StreamObserver;

public class BrugerServiceImpl extends UserGrpc.UserImplBase {

    private BrugerImpl dao;

   public BrugerServiceImpl(){
       this.dao = new BrugerImpl();
   }

    public void getUser(BrugerRequest request,
                        StreamObserver<Bruger> responseObserver) {
      try{
          String getUser = String.format("Hello, %s",
                  request.getUsername());


                  Bruger response = Bruger.newBuilder()
                          .getUsername(getUser)
                          .build();

     responseObserver.onNext(response);
      } catch (Exception e) {
          throw new RuntimeException(e);
      }


    }
}
