package com.csvdatahandling.modifycsv;
import java.io.*;

public class ModifyCSV {
	public static void main(String[] args){
		InputStream is = ModifyCSV.class.getResourceAsStream("employees.csv");
		
		if(is == null) {
			System.out.println("Fie not found");
		}
		
		String outputFilePath = "src/com/csvdatahandling/modifycsv/updatedRecords.csv";
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(is)); 
		BufferedWriter bw  = new BufferedWriter(new FileWriter(outputFilePath))){
			
			String line ;
			line = br.readLine();
			bw.write(line);
			bw.newLine();
			while((line = br.readLine()) != null) {
				
				if(line.trim().isEmpty()) {
					continue;
				}
				
				String[] columns = line.split(",");
				int id = Integer.parseInt(columns[0].trim());
				String name = columns[1].trim();
				String department = columns[2].trim();
				double salary = Double.parseDouble(columns[3].trim());
				
				if(department.equalsIgnoreCase("IT")) {
					salary = salary + (salary * 0.10);
				}
				
				bw.write(id + "," + name + "," + department + "," + salary);
                bw.newLine();
				
			}
			System.out.println("CSV updated successfully!");
            System.out.println("Output file: " + outputFilePath);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
