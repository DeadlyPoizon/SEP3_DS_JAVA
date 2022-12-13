package Server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class DatabaseServer {
    public static void main(String[] args) throws Exception {

        Server server = ServerBuilder
                .forPort(1337)
                .addService(new DatabaseServiceImpl())
                .build();
        server.start();
        System.out.println("Dataserveren starter");
        server.awaitTermination();
    }
}
