package com.day4.EduMentor;

public class Learner extends User implements ICertifiable {

    private boolean isShortCourse;

    public Learner(String name, String email, String userId, boolean isShortCourse) {
        super(name, email, userId);
        this.isShortCourse = isShortCourse;
    }

    @Override
    public void generateCertificate() {
        if (isShortCourse) {
            System.out.println("Certificate: Short Course Completion for " + name);
        } else {
            System.out.println("Certificate: Full-Time Program Completion for " + name);
        }
    }
}