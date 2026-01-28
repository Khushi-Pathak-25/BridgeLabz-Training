package test.junit.fileprocessor;

import org.junit.jupiter.api.Test;

import com.junit.fileprocessor.FileProcessor;

import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

public class FileProcessorTest {
    private final FileProcessor processor = new FileProcessor();
    private final String filename = "testfile.txt";

    @Test
    void testWriteAndReadFile() throws IOException {
        processor.writeToFile(filename, "Hello World");
        assertEquals("Hello World", processor.readFromFile(filename));
    }

    @Test
    void testFileExistsAfterWrite() throws IOException {
        processor.writeToFile(filename, "Test");
        assertTrue(new File(filename).exists());
    }

    @Test
    void testIOExceptionWhenFileDoesNotExist() {
        assertThrows(IOException.class, () -> processor.readFromFile("nonexistent.txt"));
    }
}