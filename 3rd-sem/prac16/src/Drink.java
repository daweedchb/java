public final class Drink implements Item {
    private final String name, description;
    private final double price;

    public Drink(String name, String description, double price) throws Exception {
        this.name = name;
        this.description = description;
        this.price = price;
        if (name.equals("") || description.equals("") || price == 0)
            throw new Exception("java.lang.IllegalArgumentException ");
    }

    public Drink(String name, String description) throws Exception {
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

    public String toString() {
        return "Цена: " + price + ", Напиток: " + name;
    }
}