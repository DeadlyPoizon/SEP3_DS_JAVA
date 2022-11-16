package Server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class BrugerServer {
    public static void main(String[] args) throws Exception {

            Server server = ServerBuilder
                    .forPort(6969)
                    .addService(new BrugerServiceImpl())
                    .build();
            server.start();
            server.awaitTermination();
        }
}
