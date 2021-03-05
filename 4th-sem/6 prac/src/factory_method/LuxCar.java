package factory_method;

class LuxCar extends Car {
    public LuxCar() {
        name = "Luxury Car";
        accessories.add("Leather salon");
        accessories.add("Air condition");
        accessories.add("GPS");
        accessories.add("Heated steering wheel");
    }
}
