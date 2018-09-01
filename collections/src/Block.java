import java.util.*;

class Block {
    private int serialNumber;
    private String information;
    List<MainCollections.BANKS> banks = new ArrayList<>();
    List<MainCollections.CLIENTS> clients = new ArrayList<>();

    public Block() {
        Random random = new Random();
        this.serialNumber = random.nextInt();
        this.information = "";

        banks.add(MainCollections.BANKS.ALFABANK);
        banks.add(MainCollections.BANKS.SBERBANK);
        banks.add(MainCollections.BANKS.TINKOFF);
        banks.add(MainCollections.BANKS.BANKSPB);
        banks.add(MainCollections.BANKS.ROCKETBANK);

        clients.add(MainCollections.CLIENTS.VANYA);
        clients.add(MainCollections.CLIENTS.PETYA);
        clients.add(MainCollections.CLIENTS.VLAD);
        clients.add(MainCollections.CLIENTS.VOVA);
        clients.add(MainCollections.CLIENTS.LOLIK);
        clients.add(MainCollections.CLIENTS.BOLIK);
        clients.add(MainCollections.CLIENTS.ANABOLIK);
    }

    Block(String information) {
        Random random = new Random();
        this.information = information;
        this.serialNumber = random.nextInt();

        banks.add(MainCollections.BANKS.ALFABANK);
        banks.add(MainCollections.BANKS.SBERBANK);
        banks.add(MainCollections.BANKS.TINKOFF);
        banks.add(MainCollections.BANKS.BANKSPB);
        banks.add(MainCollections.BANKS.ROCKETBANK);

        clients.add(MainCollections.CLIENTS.VANYA);
        clients.add(MainCollections.CLIENTS.PETYA);
        clients.add(MainCollections.CLIENTS.VLAD);
        clients.add(MainCollections.CLIENTS.VOVA);
        clients.add(MainCollections.CLIENTS.LOLIK);
        clients.add(MainCollections.CLIENTS.BOLIK);
        clients.add(MainCollections.CLIENTS.ANABOLIK);
    }

    String getInformation() {
        return information;
    }

    int getSerialNumber() {
        return serialNumber;
    }

    void setRandomInfo(int randomIndexBanks, int randomIndexClients) {
        String info = banks.get(randomIndexBanks).toString() + "_" + clients.get(randomIndexClients).toString();
        information = info;
    }
}
