package abstract_factory;

public class CocaColaBottle extends AbstractBottle {
    @Override
    public void interact(AbstractWater water) {
        System.out.println("Bottle of cola was created");
    }
}
