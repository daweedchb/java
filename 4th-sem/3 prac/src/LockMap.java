import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class LockMap<E, R> extends HashMap<E, R> {
    private static final Lock lock = new ReentrantLock();

    @Override
    public boolean containsKey(Object key) {
        lock.lock();
        boolean t = super.containsKey(key);
        lock.unlock();
        return t;
    }

    @Override
    public boolean containsValue(Object value) {
        lock.lock();
        boolean t = super.containsValue(value);
        lock.unlock();
        return t;
    }

    @Override
    public int size() {
        lock.lock();
        int t = super.size();
        lock.unlock();
        return t;
    }

    @Override
    public boolean isEmpty() {
        lock.lock();
        boolean t = super.isEmpty();
        lock.unlock();
        return t;
    }

    @Override
    public R get(Object key) {
        lock.lock();
        R t = super.get(key);
        lock.unlock();
        return t;
    }

    @Override
    public R remove(Object key) {
        lock.lock();
        R t = super.remove(key);
        lock.unlock();
        return t;
    }

    @Override
    public void clear() {
        lock.lock();
        super.clear();
        lock.unlock();
    }

    @Override
    public Set<E> keySet() {
        lock.lock();
        Set<E> t = super.keySet();
        lock.unlock();
        return t;
    }

    @Override
    public Collection values() {
        lock.lock();
        Collection<R> t = super.values();
        lock.unlock();
        return t;
    }

    @Override
    public Set<Entry<E, R>> entrySet() {
        lock.lock();
        Set<Entry<E, R>> t = super.entrySet();
        lock.unlock();
        return t;
    }

    @Override
    public R getOrDefault(Object key, R defaultValue) {
        lock.lock();
        R t = super.getOrDefault(key, defaultValue);
        lock.unlock();
        return t;
    }

    @Override
    public R putIfAbsent(E key, R value) {
        lock.lock();
        R t = super.putIfAbsent(key, value);
        lock.unlock();
        return t;
    }

    @Override
    public boolean remove(Object key, Object value) {
        lock.lock();
        boolean t = super.remove(key, value);
        lock.unlock();
        return t;
    }

    @Override
    public boolean replace(E key, R oldValue, R newValue) {
        lock.lock();
        boolean t = super.replace(key, oldValue, newValue);
        lock.unlock();
        return t;
    }

    @Override
    public R replace(E key, R value) {
        lock.lock();
        R t = super.replace(key, value);
        lock.unlock();
        return t;
    }

    @Override
    public R computeIfAbsent(E key, Function<? super E, ? extends R> mappingFunction) {
        lock.lock();
        R t = super.computeIfAbsent(key, mappingFunction);
        lock.unlock();
        return t;
    }

    @Override
    public R computeIfPresent(E key, BiFunction<? super E, ? super R, ? extends R> remappingFunction) {
        lock.lock();
        R t = super.computeIfPresent(key, remappingFunction);
        lock.unlock();
        return t;
    }

    @Override
    public R compute(E key, BiFunction<? super E, ? super R, ? extends R> remappingFunction) {
        lock.lock();
        R t = super.compute(key, remappingFunction);
        lock.unlock();
        return t;
    }

    @Override
    public R merge(E key, R value, BiFunction<? super R, ? super R, ? extends R> remappingFunction) {
        lock.lock();
        R t = super.merge(key, value, remappingFunction);
        lock.unlock();
        return t;
    }

    @Override
    public void forEach(BiConsumer<? super E, ? super R> action) {
        lock.lock();
        super.forEach(action);
        lock.unlock();
    }

    @Override
    public void replaceAll(BiFunction<? super E, ? super R, ? extends R> function) {
        lock.lock();
        super.replaceAll(function);
        lock.unlock();
    }

    @Override
    public Object clone() {
        lock.lock();
        Object t = super.clone();
        lock.unlock();
        return t;
    }

    @Override
    public boolean equals(Object o) {
        lock.lock();
        boolean t = super.equals(o);
        lock.unlock();
        return t;
    }

    @Override
    public int hashCode() {
        lock.lock();
        int t = super.hashCode();
        lock.unlock();
        return t;
    }

    @Override
    public void putAll(Map m) {
        lock.lock();
        super.putAll(m);
        lock.unlock();
    }

    @Override
    public R put(E key, R value) {
        lock.lock();
        R t = super.put(key, value);
        lock.unlock();
        return t;
    }
}
