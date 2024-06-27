package collections;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest {
    public static void main(String[] args) {
        NavigableMap<String, String> navigableMap = new TreeMap<>();
        navigableMap.put("A", "Word A");
        navigableMap.put("D", "Word D");
        navigableMap.put("C", "Word C");
        navigableMap.put("B", "Word B");

        for (Map.Entry<String, String> entry : navigableMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println(navigableMap.headMap("C"));
    }
}
