import java.util.HashMap;

public class OrderManager {
    private HashMap<Integer, RestaurantOrder> restaurantOrderHashMap;
    private HashMap<String, InternetOrder> internetOrderHashMap;

    public OrderManager() {
        restaurantOrderHashMap = new HashMap<>();
        internetOrderHashMap = new HashMap<>();
    }

    public boolean add(int tableNumber, RestaurantOrder order) throws Exception {
        if (restaurantOrderHashMap.containsKey(tableNumber)) {
            throw new Exception("OrderAlreadyAddedException");
        } else {
            restaurantOrderHashMap.put(tableNumber, order);
            return true;
        }
    }

    public boolean add(String address, InternetOrder order) {
        try {
            internetOrderHashMap.put(address, order);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void removeRestaurantOrder(int tableNumber) {
        restaurantOrderHashMap.remove(tableNumber);
    }

    public void removeInternetOrder(String address) {
        internetOrderHashMap.remove(address);
    }

    public RestaurantOrder getRestaurantOrder(int tableNumber) {
        return restaurantOrderHashMap.get(tableNumber);
    }

    public InternetOrder getInternetOrder(String address) {
        return internetOrderHashMap.get(address);
    }

    public double RestaurantOrdersCostSummary() {
        double total = 0;
        for (int key : restaurantOrderHashMap.keySet()) {
            total += restaurantOrderHashMap.get(key).priceTotal();
        }
        return total;
    }

    public double InternetOrdersCostSummary() {
        double total = 0;
        for (String key : internetOrderHashMap.keySet()) {
            total += internetOrderHashMap.get(key).priceTotal();
        }
        return total;
    }

    public void addDishRestaurantOrder(int tableNumber, Dish dish) {
        restaurantOrderHashMap.get(tableNumber).add(dish);
    }

    public void addDrinkRestaurantOrder(int tableNumber, Drink drink) {
        restaurantOrderHashMap.get(tableNumber).add(drink);
    }

    public void addDishInternetOrder(String address, Dish dish) {
        internetOrderHashMap.get(address).add(dish);
    }

    public void addDrinkInternetOrder(String address, Drink drink) {
        internetOrderHashMap.get(address).add(drink);
    }

    public String getAllOrders() {
        StringBuilder s = new StringBuilder();
        if (!restaurantOrderHashMap.isEmpty()) {
            s.append("Заказы в ресторане:\n");
            for (int key : restaurantOrderHashMap.keySet()) {
                s.append("Заказ на столик №").append(key).append(" на сумму : ").append(restaurantOrderHashMap.get(key).priceTotal()).append("\n");
            }
        }
        if (!internetOrderHashMap.isEmpty()) {
            s.append("Заказы через интернете:\n");
            for (String key : internetOrderHashMap.keySet()) {
                s.append("Заказ на адрес: ").append(key).append(" на сумму : ").append(internetOrderHashMap.get(key).priceTotal()).append("\n");
            }
        }
        return s.toString();
    }
}
