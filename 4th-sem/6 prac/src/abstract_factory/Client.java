package abstract_factory;

public class Client {
    private final AbstractWater water;
    private final AbstractBottle bottle;

    public Client(AbstractFactory factory) {
        water = factory.createWater();
        bottle = factory.createBottle();
    }

    public void run() {
        bottle.interact(water);
    }
}
