package com.day7.SkillForge;

public class AdvancedCourse extends Course {

    public AdvancedCourse(String title, String instructor, String[] m) {
        super(title, instructor, m);
    }

    @Override
    public String certificateFormat() {
        return "Gold Advanced Certificate for " + getTitle();
    }
}
