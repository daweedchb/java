package prototype;

public class ConcretePrototype2 extends Prototype {
    public ConcretePrototype2(int id) {
        super(id);
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype2(Id);
    }

    @Override
    public String toString() {
        return "ConcretePrototype2{" +
                "Id=" + Id +
                '}';
    }
}
