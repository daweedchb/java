package abstract_factory;

public class PepsiFactory extends AbstractFactory {
    @Override
    public AbstractWater createWater() {
        return new PepsiWater();
    }

    @Override
    public AbstractBottle createBottle() {
        return new PepsiBottle();
    }
}
