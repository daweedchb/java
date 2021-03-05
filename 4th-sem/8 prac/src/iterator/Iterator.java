package iterator;

public interface Iterator<E> {
    void reset();

    E next();

    E currentItem();

    boolean hasNext();
}