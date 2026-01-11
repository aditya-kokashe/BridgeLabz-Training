package com.algorithmsoptimization.LargeFileReading;

import java.io.*;

public class ReadUsingFileReader {
    public void read(String file) throws Exception {
        FileReader fr = new FileReader(file);
        while (fr.read() != -1) { }
        fr.close();
    }
}
