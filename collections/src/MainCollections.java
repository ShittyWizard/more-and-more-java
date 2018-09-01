import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class MainCollections {
    enum BANKS {
        ALFABANK, SBERBANK, TINKOFF, BANKSPB, ROCKETBANK;
    }

    enum CLIENTS {
        VANYA, PETYA, VLAD, VOVA, LOLIK, BOLIK, ANABOLIK;
    }

    public static void main(String[] args) {
        System.out.println("This is my package for learning collections");
        final int n = 1_000_000;

        Random random = new Random();

        HashMap<Integer, String> blockMap = new HashMap<>();
        // Info about block is name of new bank account (Format: *name_of_bank* + *_* + *name_of_client*)

        for (int i = 0; i < 1000; i++) {
            Block block = new Block();
            block.setRandomInfo(random.nextInt(block.banks.size()), random.nextInt(block.clients.size()));

            blockMap.put(block.getSerialNumber(), block.getInformation());
        }

        blockMap.forEach((k,v) -> System.out.println("Key: " + k + " Value: " + v));

        //TODO: remove not unique blocks (maybe use Set<> for that)

    }
}
