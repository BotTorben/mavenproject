package thws.de.Lektion20.Uebung3;

import java.util.*;

public class DictionaryMultiMap {
    private final Map<String, List<String>> map = new HashMap<>();

    // put: fügt eine neue deutsche Bedeutung zum englischen Wort hinzu
    public void put(String english, String german) {
        map.computeIfAbsent(english, k -> new ArrayList<>()).add(german);
    }

    // get: gibt die Liste der deutschen Bedeutungen zurück
    public List<String> get(String english) {
        return map.getOrDefault(english, Collections.emptyList());
    }

    // Optional: alles anzeigen
    public void printAll() {
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + String.join(", ", entry.getValue()));
        }
    }
}

