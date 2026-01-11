package com.algorithmsoptimization.LargeFileReading;

import java.io.*;

public class FileReadComparisonSingle {

    public static void readUsingFileReader(String file) throws Exception {
        FileReader fr = new FileReader(file);
        int ch;
        while ((ch = fr.read()) != -1) {
            // reading
        }
        fr.close();
    }

    public static void readUsingInputStreamReader(String file) throws Exception {
        InputStreamReader isr = new InputStreamReader(new FileInputStream(file));
        int ch;
        while ((ch = isr.read()) != -1) {
            // reading
        }
        isr.close();
    }

    public static void main(String[] args) throws Exception {

        String filePath = "largefile.txt"; // use any large file

        long start = System.nanoTime();
        readUsingFileReader(filePath);
        long end = System.nanoTime();
        System.out.println("FileReader Time: " + (end-start)/1_000_000 + " ms");

        start = System.nanoTime();
        readUsingInputStreamReader(filePath);
        end = System.nanoTime();
        System.out.println("InputStreamReader Time: " + (end-start)/1_000_000 + " ms");
    }
}
