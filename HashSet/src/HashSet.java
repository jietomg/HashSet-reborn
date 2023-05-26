import java.util.HashMap;
import java.util.Iterator;

public class HashSet<E> {
    private static final Object PRESENT = new Object();
    private final MyHashMap<E, Object> map;

    public HashSet() {
        map = new MyHashMap<>();
    }

    public void add(E element) {
        if (!contains(element)) {
            map.put(element, PRESENT);
        }
    }

    public void remove(E element) {
        if (contains(element)) {
            map.delete(element);
        }
    }

    public boolean contains(E element) {
        return map.containsKey(element);
    }

    public int size() {
        return map.size();
    }


}