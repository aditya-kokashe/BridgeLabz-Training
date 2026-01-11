package com.algorithmsoptimization.LargeFileReading;

import java.io.*;

public class ReadUsingInputStreamReader {
    public void read(String file) throws Exception {
        InputStreamReader isr = new InputStreamReader(new FileInputStream(file));
        while (isr.read() != -1) { }
        isr.close();
    }
}
