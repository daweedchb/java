package decorator;

public class ConcreteDecoratorA extends Decorator {
    String addedState = "Some state";

    @Override
    public void operation() {
        super.operation();
        System.out.println(addedState);
    }
}
