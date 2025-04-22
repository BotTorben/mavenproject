package thws.de.Lektion17.Uebung3;

import java.io.*;
import java.util.Scanner;

public class MusikKopierer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pfad zur Musikdatei eingeben: ");
        String sourcePath = scanner.nextLine();
        File source = new File(sourcePath);

        if (!source.exists()) {
            System.err.println("Datei nicht gefunden: " + source.getAbsolutePath());
            return;
        }

        for (int i = 1; i <= 3; i++) {
            long totalTime = 0;
            System.out.println("\n--- Test " + i + " ---");

            for (int j = 0; j < 10; j++) {
                File destFile = new File("copy" + i + "_" + j + ".mp3");
                long startTime = System.currentTimeMillis();

                try {
                    switch (i) {
                        case 1 -> copyUnbufferedBytewise(source, destFile);
                        case 2 -> copyBufferedBytewise(source, destFile);
                        case 3 -> copyUnbufferedWithBuffer(source, destFile);
                    }
                } catch (IOException e) {
                    System.err.println("Fehler beim Kopieren: " + e.getMessage());
                    return;
                }

                long duration = System.currentTimeMillis() - startTime;
                totalTime += duration;

                if (source.length() != destFile.length()) {
                    System.err.println("Warnung: Datei " + destFile.getName() + " ist unterschiedlich groß!");
                }
            }

            System.out.println("Durchschnittliche Zeit (ms): " + (totalTime / 10.0));
        }
    }

    public static void copyUnbufferedBytewise(File source, File dest) throws IOException {
        try (InputStream in = new FileInputStream(source);
             OutputStream out = new FileOutputStream(dest)) {
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
        }
    }

    public static void copyBufferedBytewise(File source, File dest) throws IOException {
        try (InputStream in = new BufferedInputStream(new FileInputStream(source));
             OutputStream out = new BufferedOutputStream(new FileOutputStream(dest))) {
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
        }
    }

    public static void copyUnbufferedWithBuffer(File source, File dest) throws IOException {
        try (InputStream in = new FileInputStream(source);
             OutputStream out = new FileOutputStream(dest)) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = in.read(buffer)) != -1) {
                out.write(buffer, 0, len);
            }
        }
    }
}
