package factory_method;

class LuxCarFactory extends CarFactory {
    public Car createCar() {
        return new LuxCar();
    }
}
