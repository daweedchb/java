package factory_method;

class BasicCarFactory extends CarFactory {
    public Car createCar() {
        return new BasicCar();
    }
}
