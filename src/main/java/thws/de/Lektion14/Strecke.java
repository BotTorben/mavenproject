package thws.de.Lektion14;

public class Strecke {
    int a;
    int b;

    public Strecke(){
        if(a >= b){
            this.a = b;
            this.b = a;
        } else {
            this.a = a;
            this.b = b;
        }
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
