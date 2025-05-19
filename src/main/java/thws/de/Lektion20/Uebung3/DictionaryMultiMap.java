package thws.de.Lektion20.Uebung3;

import java.util.*;

public class DictionaryMultiMap {
    private final Map<String, List<String>> map = new HashMap<>();

    public void put(String english, String german) {
        map.computeIfAbsent(english, k -> new ArrayList<>()).add(german);
    }

    public List<String> get(String english) {
        return map.getOrDefault(english, Collections.emptyList());
    }

    public void printAll() {
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + String.join(", ", entry.getValue()));
        }
    }
}

