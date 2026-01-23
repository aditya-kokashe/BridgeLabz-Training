package com.streams.bufferedstreams;

import java.io.*;

public class BufferedVsUnbufferedCopy {

    public static void main(String[] args) throws IOException {

        String sourceFile = "src/com/streams/bufferedstreams/largefile.dat";
        String unbufferedCopy = "src/com/streams/bufferedstreams/unbufferedCopy.dat";
        String bufferedCopy = "src/com/streams/bufferedstreams/bufferedCopy.dat";

        // Unbuffered copy
        long startUnbuffered = System.nanoTime();
        CopyUsingUnbuffered.copyUsingUnbufferedStream(sourceFile, unbufferedCopy);
        long endUnbuffered = System.nanoTime();

        // Buffered copy
        long startBuffered = System.nanoTime();
        CopyUsingBuffered.copyUsingBufferedStream(sourceFile, bufferedCopy);
        long endBuffered = System.nanoTime();

        System.out.println("Unbuffered Stream Time: " +
                (endUnbuffered - startUnbuffered) / 1_000_000 + " ms");

        System.out.println("Buffered Stream Time: " +
                (endBuffered - startBuffered) / 1_000_000 + " ms");
    }


}
