package builder;

import builder.house.House;

public class Main {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Foreman foreman = new Foreman(builder);
        foreman.constructTwoFloorHouse();

        House house = builder.getResult();
        System.out.println(house);
    }
}
