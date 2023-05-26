package HashMap;

public class MyKeyValueEntry <K,V> {
    private K key;
    private V value;

    public MyKeyValueEntry (K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }
}
