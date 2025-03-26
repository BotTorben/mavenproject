package thws.de.Lektion14;

public class Kugelvolumen {

    public static double berecheneKugelvolumen(double radius){
        if(radius < 0){
            throw new RuntimeException("Es sind keine Negativen Werte gültig");
        }
        return 4.0/3.0*Math.PI*radius*radius*radius;
    }
}
