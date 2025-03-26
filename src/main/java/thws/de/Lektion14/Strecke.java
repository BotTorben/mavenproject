package thws.de.Lektion14;

public class Strecke {
    int a;
    int b;

    public Strecke(int a, int b){
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
    
    public boolean ueberpruefeUeberschneidung(Strecke a, Strecke b){
        boolean bl = false;
        if(a.getA() == b.getA() && a.getB() == b.getB()) bl = true;
        return bl;
    }

    @Override
    public String toString(){
        String out = "";
        if(a == b)return out += a;
        
        out += a;
        for(int i = 0; i < b-a; i++){
            out += "-";
        }
        out += b;
        return out;
    }
}
