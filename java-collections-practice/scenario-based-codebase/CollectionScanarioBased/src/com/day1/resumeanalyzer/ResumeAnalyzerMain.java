package com.day1.resumeanalyzer;

import java.io.File;
import java.util.List;

public class ResumeAnalyzerMain {

    public static void main(String[] args) {

        ResumeProcessor processor = new ResumeProcessor();

        // folder containing resumes
        File folder = new File("src/com/day1/resumeanalyzer/resumes"); 
        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Resume folder not found.");
            return;
        }

        for (File file : folder.listFiles()) {
            try {
                ResumeData data = ResumeReader.readResume(file);
                processor.addResume(data);
            } catch (Exception e) {
                System.out.println("Skipped file: " + file.getName());
            }
        }

        System.out.println("\n--- Sorted Candidates by Skill Match ---");
        List<ResumeData> sorted = processor.getSortedCandidates();
        for (ResumeData data : sorted) {
            System.out.println(data);
        }
    }
}