package prototype;

public class Main {
    public static void main(String[] args) {
        Prototype prototype;
        Prototype clone;

        prototype = new ConcretePrototype1(1);
        clone = prototype.clone();
        System.out.println(prototype);
        System.out.println(clone);

        prototype = new ConcretePrototype2(2);
        clone = prototype.clone();
        System.out.println(prototype);
        System.out.println(clone);
    }
}
