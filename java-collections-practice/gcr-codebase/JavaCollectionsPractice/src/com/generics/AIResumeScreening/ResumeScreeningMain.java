package com.generics.AIResumeScreening;

import java.util.ArrayList;
import java.util.List;

public class ResumeScreeningMain{

    public static void main(String[] args) {
        Resume<SoftwareEngineer> r1 = new Resume<>("Bhargav", new SoftwareEngineer());
        Resume<DataScientist> r2 = new Resume<>("Mohan", new DataScientist());
        Resume<ProductManager> r3 = new Resume<>("Karan", new ProductManager());

        ScreeningUtil.processResume(r1);
        ScreeningUtil.processResume(r2);
        ScreeningUtil.processResume(r3);

        //Screening pipeline for multiple roles
        List<JobRole> roles = new ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());
        roles.add(new ProductManager());

        ScreeningUtil.processPipeline(roles);
    }
}
