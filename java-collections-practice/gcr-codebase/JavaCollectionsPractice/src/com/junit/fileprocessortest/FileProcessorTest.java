package com.junit.fileprocessortest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;

public class FileProcessorTest {

    FileProcessor fp = new FileProcessor();

    @Test
    void testWriteAndRead() throws IOException {
        String file = "src/com/junit/fileprocessortest/test.txt";
        fp.writeToFile(file, "Hello world");
        assertEquals("Hello", fp.readFromFile(file));
        assertTrue(new File(file).exists());
    }

    @Test
    void testFileNotFound() {
        assertThrows(IOException.class, () -> fp.readFromFile("nofile.txt"));
    }
}
