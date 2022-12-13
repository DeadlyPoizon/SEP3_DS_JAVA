package Server;


import DAOs.AktieImpl;
import DAOs.BrugerImpl;
import DAOs.DepotImpl;
import DAOs.TransaktionImpl;
import DTOs.Transaktion;
import GRPC.bruger.*;
import io.grpc.stub.StreamObserver;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class DatabaseServiceImpl extends BrugerServiceGrpc.BrugerServiceImplBase {

    private final BrugerImpl brugerDAO;
    private final AktieImpl aktieDAO;
    private final DepotImpl depotDAO;
    private final TransaktionImpl transDAO;

    public DatabaseServiceImpl() {
        this.brugerDAO = new BrugerImpl();
        this.aktieDAO = new AktieImpl();
        this.depotDAO = new DepotImpl();
        this.transDAO = new TransaktionImpl();
    }

    @Override
    public void createBruger(Bruger request,
                             StreamObserver<BrugerResponse> responseObserver) {
        boolean responsebool;
        System.out.println(request.getUsername());
        if (brugerDAO.create(request.getUsername(), request.getPassword(), request.getDepotID(), request.getSaldo())) {
            System.out.println("Created");
            responsebool = true;
        } else {
            responsebool = false;
        }
        BrugerResponse response = BrugerResponse.newBuilder()
                .setResponse(responsebool)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getBruger(BrugerRequest brugerRequest, StreamObserver<Bruger> streamObserver) {
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
    public void handleAktie(AktieRequest request, StreamObserver<AktieResponse> streamObserver) {
        if (request.getParam().equals("buy")) {
            System.out.println("Buying");
            double købspris = aktieDAO.getAktie(request.getAktie(0).getNavn()).getPris();
            depotDAO.createDepotEntry(request.getDepotID(), request.getAktie(0).getNavn(), request.getAntal(), købspris);
            transDAO.createTransaktion(request.getDepotID(), brugerDAO.getUser(request.getDepotID()), request.getAktie(0).getNavn(), request.getAntal(), new Date(System.currentTimeMillis()));
            brugerDAO.buyAktie(købspris, request.getDepotID());

            AktieResponse aktieResponse = AktieResponse.newBuilder()
                    .setResponse(request.getAntal() + " " + request.getAktie(0).getFirma() + " aktier købt til pris: " + købspris)
                    .build();
            streamObserver.onNext(aktieResponse);
            streamObserver.onCompleted();
        } else if (request.getParam().equals("sell")) {
            System.out.println("Selling");
            double value = aktieDAO.getAktie(request.getAktie(0).getNavn()).getLow();
            brugerDAO.sellAktie(value, request.getDepotID());
            depotDAO.removeDepotEntry(request.getDepotID(), request.getAktie(0).getNavn(), request.getAntal());
            transDAO.createTransaktion(request.getDepotID(), brugerDAO.getUser(request.getDepotID()), request.getAktie(0).getNavn(), request.getAntal(), new Date(System.currentTimeMillis()));
            AktieResponse aktieResponse = AktieResponse.newBuilder()
                    .setResponse(String.valueOf(value))
                    .build();
            streamObserver.onNext(aktieResponse);
            streamObserver.onCompleted();
        } else if (request.getParam().equals("update")) {
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
    public void getAktie(AktieName name, StreamObserver<Aktie> streamObserver) {
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
    public void getAll(getAllAktier request, StreamObserver<allAktier> streamObserver) {
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
        System.out.println(allAktier);
        streamObserver.onNext(allAktier);
        streamObserver.onCompleted();
    }

    @Override
    public void getAllDepoter(getDepotFraID depotID, StreamObserver<DepotResponse> streamObserver) {
        List<DTOs.Depot> depoter = depotDAO.getAll(depotID.getDepotID());
        List<Depot> tempDepot = new ArrayList<>();

        for (int i = 0; i < depoter.size(); i++) {
            Depot depot = Depot.newBuilder()
                    .setId(depoter.get(i).getId())
                    .setAntal(depoter.get(i).getAntal())
                    .setAktienavn(depoter.get(i).getAktieNavn())
                    .setPris(depoter.get(i).getKøbspris())
                    .build();
            tempDepot.add(depot);
        }

        DepotResponse response = DepotResponse.newBuilder().addAllDepoter(tempDepot).build();
        streamObserver.onNext(response);
        streamObserver.onCompleted();
    }


    @Override
    public void handleBruger(BrugerRequest request, StreamObserver<BrugerResponse> streamObserver) {
        if (request.getParam().equals("reset")) {
            brugerDAO.reset(request.getBruger(0).getDepotID());
            depotDAO.reset(request.getBruger(0).getDepotID());
            transDAO.reset(brugerDAO.getUser(request.getBruger(0).getDepotID()));

            BrugerResponse response = BrugerResponse.newBuilder()
                    .setResponse(true).build();
            streamObserver.onNext(response);
            streamObserver.onCompleted();
        }
    }

    @Override
    public void getAllTransactions(TransactionRequest transactionRequest, StreamObserver<AllTransactions> streamObserver) {
        List<Transaktion> transaktioner = transDAO.getUserTransaktioner(transactionRequest.getUsername());
        List<Transaction> transactions = new ArrayList<>(transaktioner.size());

        for (int i = 0; i < transaktioner.size(); i++) {
            Transaction transaction = Transaction.newBuilder()
                    .setUsername(transaktioner.get(i).getUsername())
                    .setAntal(transaktioner.get(i).getAntal())
                    .setTransaktionID(transaktioner.get(i).getTransaktionsID())
                    .setDate(transaktioner.get(i).getDate().getTime())
                    .setAktienavn(transaktioner.get(i).getAktienavn())
                    .build();
            transactions.add(transaction);
        }
        AllTransactions allTransactions = AllTransactions.newBuilder().addAllTransaktioner(transactions).build();
        streamObserver.onNext(allTransactions);
        streamObserver.onCompleted();
    }

}

