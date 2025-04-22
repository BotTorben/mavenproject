package thws.de.Lektion17.Uebung4;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDoubler extends OutputStream {
    private final OutputStream out1;
    private final OutputStream out2;

    public OutputStreamDoubler(OutputStream out1, OutputStream out2) {
        this.out1 = out1;
        this.out2 = out2;
    }

    @Override
    public void write(int b) throws IOException {
        IOException exception1 = null;
        IOException exception2 = null;

        try {
            out1.write(b);
        } catch (IOException e) {
            exception1 = e;
            System.err.println("Fehler beim Schreiben in Stream 1:");
            e.printStackTrace();
        }

        try {
            out2.write(b);
        } catch (IOException e) {
            exception2 = e;
            System.err.println("Fehler beim Schreiben in Stream 2:");
            e.printStackTrace();
        }

        if (exception1 != null || exception2 != null) {
            throw new IOException("Mindestens ein Stream hatte beim Schreiben einen Fehler.");
        }
    }

    @Override
    public void close() throws IOException {
        IOException exception1 = null;
        IOException exception2 = null;

        try {
            out1.close();
        } catch (IOException e) {
            exception1 = new IOException("Fehler beim Schließen von Stream 1", e);
        }

        try {
            out2.close();
        } catch (IOException e) {
            exception2 = new IOException("Fehler beim Schließen von Stream 2", e);
        }

        if (exception1 != null && exception2 != null) {
            IOException combined = new IOException("Fehler beim Schließen beider Streams");
            combined.addSuppressed(exception1);
            combined.addSuppressed(exception2);
            throw combined;
        } else if (exception1 != null) {
            throw exception1;
        } else if (exception2 != null) {
            throw exception2;
        }
    }
}

