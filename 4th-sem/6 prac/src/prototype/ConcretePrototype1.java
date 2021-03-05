package prototype;

public class ConcretePrototype1 extends Prototype {
    public ConcretePrototype1(int id) { super(id); }

    @Override
    public Prototype clone() { return new ConcretePrototype1(Id); }

    @Override
    public String toString() {
        return "ConcretePrototype1{" +
                "Id=" + Id +
                '}';
    }
}
