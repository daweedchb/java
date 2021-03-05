package abstract_factory;

public class Main {
    public static void main(String[] args) {
        Client client;

        client = new Client(new CocaColaFactory());
        client.run();

        client = new Client(new PepsiFactory());
        client.run();
    }
}
