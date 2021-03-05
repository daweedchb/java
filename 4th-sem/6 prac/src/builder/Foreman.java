package builder;

public class Foreman {
    Builder builder;

    public Foreman(Builder builder) {
        this.builder = builder;
    }

    public void constructOneFloorHouse() {
        builder.buildBasement();
        builder.buildStorey();
        builder.buildRoof();
    }

    public void constructTwoFloorHouse() {
        builder.buildBasement();
        builder.buildStorey();
        builder.buildStorey();
        builder.buildRoof();
    }
}
