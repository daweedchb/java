package decorator;

public class ConcreteDecoratorB extends Decorator {
    void addedBehavior() {
        System.out.println("Behavior");
    }

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
    }
}
