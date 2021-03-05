package builder;

import builder.house.*;

public class ConcreteBuilder implements Builder {
    House house = new House();

    @Override
    public void buildBasement() {
        house.add(new Basement());
    }

    @Override
    public void buildStorey() {
        house.add(new Storey());
    }

    @Override
    public void buildRoof() {
        house.add(new Roof());
    }

    @Override
    public House getResult() {
        return house;
    }
}
