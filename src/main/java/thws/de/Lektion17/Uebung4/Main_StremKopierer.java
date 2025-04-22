package thws.de.Lektion17.Uebung4;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main_StremKopierer {
    public static void main(String[] args) {
        try (
            FileOutputStream fos1 = new FileOutputStream("file1.txt");
            FileOutputStream fos2 = new FileOutputStream("file2.txt");
            OutputStreamDoubler doubler = new OutputStreamDoubler(fos1, fos2)
        ) {
            String message = "Hallo, Welt!\n";
            byte[] bytes = message.getBytes();
            for (byte b : bytes) {
                doubler.write(b);
            }
        } catch (IOException e) {
            System.err.println("Fehler in der Hauptverarbeitung:");
            e.printStackTrace();
        }
    }
}

