package thws.de.Lektion17Test;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

public class OutputStreamTest {

    @Test
    public void testNullArray() throws IOException {
        try (FileOutputStream out = new FileOutputStream(Files.createTempFile("test", ".tmp").toFile())) {
            assertThrows(NullPointerException.class, () -> {
                out.write(null, 0, 1);
            });
        }
    }

    @Test
    public void testNegativeOffset() throws IOException {
        try (FileOutputStream out = new FileOutputStream(Files.createTempFile("test", ".tmp").toFile())) {
            byte[] data = {1, 2, 3};
            assertThrows(IndexOutOfBoundsException.class, () -> {
                out.write(data, -1, 2);
            });
        }
    }

    @Test
    public void testNegativeLength() throws IOException {
        try (FileOutputStream out = new FileOutputStream(Files.createTempFile("test", ".tmp").toFile())) {
            byte[] data = {1, 2, 3};
            assertThrows(IndexOutOfBoundsException.class, () -> {
                out.write(data, 0, -1);
            });
        }
    }

    @Test
    public void testOffsetTooLarge() throws IOException {
        try (FileOutputStream out = new FileOutputStream(Files.createTempFile("test", ".tmp").toFile())) {
            byte[] data = {1, 2, 3};
            assertThrows(IndexOutOfBoundsException.class, () -> {
                out.write(data, 4, 1); // off > data.length
            });
        }
    }

    @Test
    public void testLengthTooLarge() throws IOException {
        try (FileOutputStream out = new FileOutputStream(Files.createTempFile("test", ".tmp").toFile())) {
            byte[] data = {1, 2, 3};
            assertThrows(IndexOutOfBoundsException.class, () -> {
                out.write(data, 1, 3); // 1+3 > 3
            });
        }
    }

    @Test
    public void testValidWrite() throws IOException {
        Path path = Files.createTempFile("test-valid", ".tmp");
        try (FileOutputStream out = new FileOutputStream(path.toFile())) {
            byte[] data = {10, 20, 30, 40, 50};
            assertDoesNotThrow(() -> {
                out.write(data, 1, 3); // sollte klappen
            });
        }
    }
}
