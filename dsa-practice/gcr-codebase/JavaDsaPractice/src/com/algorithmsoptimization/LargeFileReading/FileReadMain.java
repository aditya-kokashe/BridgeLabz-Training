package com.algorithmsoptimization.LargeFileReading;

public class FileReadMain {

    public static void main(String[] args) throws Exception {

    	String filePath ="src/com/algorithmsoptimization/LargeFileReading/largefile.txt";

        ReadUsingFileReader r1 = new ReadUsingFileReader();
        ReadUsingInputStreamReader r2 = new ReadUsingInputStreamReader();

        long start = System.nanoTime();
        r1.read(filePath);
        long end = System.nanoTime();
        System.out.println("FileReader Time: " + (end-start)/1_000_000 + " ms");

        start = System.nanoTime();
        r2.read(filePath);
        end = System.nanoTime();
        System.out.println("InputStreamReader Time: " + (end-start)/1_000_000 + " ms");
    }
}
