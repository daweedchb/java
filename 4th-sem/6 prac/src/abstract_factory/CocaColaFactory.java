package abstract_factory;

public class CocaColaFactory extends AbstractFactory {
    @Override
    public AbstractWater createWater() {
        return new CocaColaWater();
    }

    @Override
    public AbstractBottle createBottle() {
        return new CocaColaBottle();
    }
}
