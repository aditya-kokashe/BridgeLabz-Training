package com.streams.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSerialization {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Prakash", "IT", 55000));
        employees.add(new Employee(102, "Raj", "HR", 48000));
        employees.add(new Employee(103, "Sneha", "Finance", 60000));

        String fileName = "src/com/streams/serialization/employees.dat";

        //Serialization
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
            oos.writeObject(employees);
            oos.close();
            System.out.println("Employees serialized successfully.");

        } catch (IOException e) {
            System.out.println("Error during serialization.");
        }

        //Deserialization
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
            List<Employee> empList = (List<Employee>) ois.readObject();
            ois.close();

            System.out.println("\nDeserialized Employee Data:");
            for (Employee e : empList) {
                e.display();
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization.");
        }
    }
}
