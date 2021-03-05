package prototype;

public abstract class Prototype {
    public int Id;

    public Prototype(int id) {
        Id = id;
    }

    public abstract Prototype clone();
}
