package factory_method;

class BasicCar extends Car {
    public BasicCar() {
        name = "Basic Car";
        accessories.add("Basic salon");
        accessories.add("Air condition");
    }
}