package com.streams.bytearraystream;

import java.io.*;

public class ImageToByteArray {
    public static void main(String[] args) {

        String inputImage = "src/com/streams/bytearraystream/input.jpg";
        String outputImage = "src/com/streams/bytearraystream/output.jpg";

        try {
            // Read image file into byte array
            FileInputStream fis = new FileInputStream(inputImage);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            byte[] imageBytes = baos.toByteArray();

            fis.close();
            baos.close();

            // Write byte array back to image file
            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream(outputImage);

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            bais.close();
            fos.close();

            System.out.println("Image converted to byte array and written successfully.");

        } catch (IOException e) {
            System.out.println("Error processing image file.");
        }
    }
}
