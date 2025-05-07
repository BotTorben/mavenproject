package thws.de.Lektion19;

public class Main_Generic {
    public static void main(String[] args) {
        GenericStack<String> s = new GenericStack<>();
        s.push("Hallo");
        s.push("Welt");
        System.out.println(s.pop());  
        System.out.println(s.pop());  
    }
}
