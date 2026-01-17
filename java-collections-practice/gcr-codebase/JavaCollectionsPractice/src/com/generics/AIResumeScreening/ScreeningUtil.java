package com.generics.AIResumeScreening;

import java.util.List;

public class ScreeningUtil {

    // Generic method for processing a single resume
    public static <T extends JobRole> void processResume(Resume<T> resume) {
        System.out.println("Processing: " + resume.getDetails());
    }

    public static void processPipeline(List<? extends JobRole> roles) {
        System.out.println("\nScreening pipeline for roles:");
        for (JobRole role : roles) {
            System.out.println("- " + role.getRoleName());
        }
    }
}
