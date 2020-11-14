public final class Dish implements Item {
    private final String name, description;
    private final double price;

    public Dish(String name, String description, double price) throws Exception {
        this.name = name;
        this.description = description;
        this.price = price;
        if (name.equals("") || description.equals("") || price == 0)
            throw new Exception("java.lang.IllegalArgumentException ");

    }

    public Dish(String name, String description) throws Exception {
        this.name = name;
        this.description = description;
        this.price = 0;
        throw new Exception("java.lang.IllegalArgumentException ");
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Цена: " + price + ", Блюдо: " + name;
    }
}