package thws.de.Lektion20.Uebung3;

public class Main {
    public static void main(String[] args) {
        DictionaryMultiMap dict = new DictionaryMultiMap();

        dict.put("to clean", "reinigen");
        dict.put("to clean", "säubern");
        dict.put("to clean", "putzen");

        dict.put("to expand", "vergrößern");
        dict.put("to expand", "wachsen");

        dict.printAll();

        System.out.println("\nDeutsch für 'to clean': " + dict.get("to clean"));
    }
}

