package Map;

import java.util.ArrayList;

public class MyMap <K, V> {

    private final ArrayList<K> keyArray;
    private final ArrayList<V> valArray;
    public MyMap() {
        keyArray = new ArrayList<>();
        valArray = new ArrayList<>();
    }

    public void put(K key, V value) {
        int i = keyArray.indexOf(key);

        if (i == -1) {
            keyArray.add(key);
            valArray.add(value);
        } else {
            valArray.set(i, value);
        }
    }
    public V get(K key) {
        int i = keyArray.indexOf(key);

        if (i == -1) {
            return null;
        }
        return valArray.get(i);
    }

    public V remove(K key) {
        int i = keyArray.indexOf(key);

        if (i == -1) {
            return  null;
        }
        V removedVal = valArray.get(i);

        keyArray.remove(i);
        valArray.remove(i);

        return removedVal;
    }
}
