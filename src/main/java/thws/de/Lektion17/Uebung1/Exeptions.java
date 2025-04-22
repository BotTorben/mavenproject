package thws.de.Lektion17.Uebung1;

import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Exeptions {
    public static int wandle(String in){
        int result = Integer.valueOf(in);
        return result;
    }

    public static void arrayExeption(){
        int[] ar = new int[8];
        for (int i = 0; i <= 8; i++){
            ar[i] = i;
        }
    }

    public static void nullpointerExp(){
        String text = null;
        System.out.println(text.length());
    }
    
    /*public static void memoryError(){
        for (int i = 0; i < 999999999999;i++){
            System.out.println(i);;
        }
    }*/

    public static void fileExp() throws IOException{
        InputStream fis = new FileInputStream("fileExp.doc");
        fis.close();
    }

    public static void arithmeticExp(){
        int i = 4/0;
    }
    public static void main(String[] args){
        //wandle(null);
        //arrayExeption();
        //nullpointerExp();
        //memoryError();
        //fileExp();
        //arithmeticExp();

    } 

}
