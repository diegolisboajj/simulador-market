import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        ClientQueue queue = new ClientQueue();
        new Thread(queue).start();

        new Thread(new MarketGUI("Supermercado", 4, queue)).start();
    }
}
