package decorator;

public class Main {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Decorator decoratorA = new ConcreteDecoratorA();
        Decorator decoratorB = new ConcreteDecoratorB();

        decoratorA.component = component;
        decoratorB.component = decoratorA;
        decoratorB.operation();
    }
}
