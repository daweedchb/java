import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class SynchronizedSet<E> extends HashSet<E> {
    @Override
    public synchronized Iterator<E> iterator() {
        return super.iterator();
    }

    @Override
    public synchronized int size() {
        return super.size();
    }

    @Override
    public synchronized boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public synchronized boolean contains(Object o) {
        return super.contains(o);
    }

    @Override
    public synchronized boolean add(E e) {
        return super.add(e);
    }

    @Override
    public synchronized boolean remove(Object o) {
        return super.remove(o);
    }

    @Override
    public synchronized void clear() {
        super.clear();
    }

    @Override
    public synchronized Object clone() {
        return super.clone();
    }
}
