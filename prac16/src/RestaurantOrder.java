public class RestaurantOrder implements Order {
    private int countDishes, countDrinks;
    private Dish[] dishes;
    private Drink[] drinks;

    public RestaurantOrder() {
        countDishes = 0;
        countDrinks = 0;
        dishes = new Dish[20];
        drinks = new Drink[20];
    }

    public boolean add(Dish dish) {
        if (dishes.length == countDishes) {
            Dish[] tempDishes = new Dish[countDishes + 2];
            System.arraycopy(dishes, 0, tempDishes, 0, tempDishes.length);
            dishes = tempDishes;
        }
        try {
            dishes[countDishes] = dish;
            countDishes++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    ;

    public boolean add(Drink drink) {
        if (drinks.length == countDrinks) {
            Drink[] tempDrinks = new Drink[countDrinks + 2];
            System.arraycopy(drinks, 0, tempDrinks, 0, tempDrinks.length);
            drinks = tempDrinks;
        }
        try {
            drinks[countDrinks] = drink;
            countDrinks++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void removeAll(String name) {
        while (true) {
            if (!remove(name)) {
                break;
            }
        }
    }

    public int getCount() {
        return countDishes + countDrinks;
    }

    public boolean remove(String name) {
        for (int i = 0; i < dishes.length; i++) {
            if (dishes[i].getName().equals(name)) {
                if (i == countDishes) {
                    dishes[i] = null;
                } else {
                    dishes[i] = dishes[countDishes];
                    dishes[countDishes] = null;
                }
                countDishes--;
                return true;
            }
        }
        for (int i = 0; i < drinks.length; i++) {
            if (drinks[i].getName().equals(name)) {
                if (i == countDrinks) {
                    drinks[i] = null;
                } else {
                    drinks[i] = drinks[countDrinks];
                    drinks[countDrinks] = null;
                }
                countDrinks--;
                return true;
            }
        }
        return false;
    }

    public Dish[] getAllDishes() {
        return dishes;
    }

    public Dish[] getDishes() {
        Dish[] dish = new Dish[6];
        boolean flag = true;
        if (countDishes != 0) {
            for (int i = 0; i < countDishes; i++) {
                for (int j = 0; j < 6; j++) {
                    if (dish[j] != null) {
                        if (dish[j].getName().equals(dishes[i].getName())) {
                            flag = false;
                        }
                    }
                }
                if (flag) {
                    for (int j = 0; j < 6; j++) {
                        if (dish[j] == null) {
                            dish[j] = dishes[i];
                            break;
                        }
                    }
                }
                flag = true;
            }
        }
        return dish;
    }

    public Drink[] getDrinks() {
        Drink[] drink = new Drink[6];
        boolean flag = true;
        if (countDrinks != 0) {
            for (int i = 0; i < countDrinks; i++) {
                for (int j = 0; j < 6; j++) {
                    if (drink[j] != null) {
                        if (drink[j].getName().equals(drinks[i].getName())) {
                            flag = false;
                        }
                    }
                }
                if (flag) {
                    for (int j = 0; j < 6; j++) {
                        if (drink[j] == null) {
                            drink[j] = drinks[i];
                            break;
                        }
                    }
                }
                flag = true;
            }
        }
        return drink;
    }

    public Drink[] getAllDrinks() {
        return drinks;
    }

    public double priceTotal() {
        double total = 0;
        for (Dish dish : dishes) {
            if (dish != null)
                total += dish.getPrice();
        }
        for (Drink drink : drinks) {
            if (drink != null)
                total += drink.getPrice();
        }
        return total;
    }

    public Dish[] SortedDishesByPrice() {
        for (int i = dishes.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (dishes[j] != null && dishes[j + 1] != null) {
                    if (dishes[j].getPrice() > dishes[j + 1].getPrice()) {
                        Dish tmp = dishes[j];
                        dishes[j] = dishes[j + 1];
                        dishes[j + 1] = tmp;
                    }
                }
            }
        }
        return dishes;
    }

    public Drink[] SortedDrinksByPrice() {
        for (int i = drinks.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (drinks[j] != null && drinks[j + 1] != null) {
                    if (drinks[j].getPrice() < drinks[j + 1].getPrice()) {
                        Drink tmp = drinks[j];
                        drinks[j] = drinks[j + 1];
                        drinks[j + 1] = tmp;
                    }
                }
            }
        }
        return drinks;
    }

    public int dishQuantity() {
        return countDishes;
    }

    public int drinkQuantity() {
        return countDrinks;
    }

    public int dishQuantity(String name) {
        int quantity = 0;
        for (int i = 0; i < countDishes; i++) {
            if (dishes[i].getName().equals(name)) {
                quantity++;
            }
        }
        return quantity;
    }

    public int drinkQuantity(String name) {
        int quantity = 0;
        for (int i = 0; i < countDrinks; i++) {
            if (drinks[i].getName().equals(name)) {
                quantity++;
            }
        }
        return quantity;
    }
}
