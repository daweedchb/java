public interface Order {
    boolean add(Dish dish);

    boolean add(Drink drink);

    boolean remove(String name);

    void removeAll(String name);

    int getCount();

    double priceTotal();
}