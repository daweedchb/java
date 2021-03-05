package abstract_factory;

public class PepsiBottle extends AbstractBottle {
    @Override
    public void interact(AbstractWater water) {
        System.out.println("Bottle of pepsi was created");
    }
}
