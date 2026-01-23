package com.streams.datastreams;

import java.io.*;

public class StudentDataStream {
    public static void main(String[] args) {
        String fileName = "src/com/streams/datastreams/student.dat";
        // Writing data
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName));

            dos.writeInt(101);
            dos.writeUTF("Aakash");
            dos.writeDouble(8.56);

            dos.close();
            System.out.println("Student data written successfully.");

        } catch (IOException e) {
            System.out.println("Error writing student data.");
        }

        // Reading data
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream(fileName));

            int rollNo = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            dis.close();

            System.out.println("\nRetrieved Student Data:");
            System.out.println("Roll No: " + rollNo);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);

        } catch (IOException e) {
            System.out.println("Error reading student data.");
        }
    }
}
