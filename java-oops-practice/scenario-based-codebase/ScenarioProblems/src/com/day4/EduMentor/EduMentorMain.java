package com.day4.EduMentor;

public class EduMentorMain {

    public static void main(String[] args) {

        //Users
        Learner learner1 = new Learner("Mohan", "mohan@email.com", "101", true);
        Learner learner2 = new Learner("Saumya", "sm@email.com", "102", false);

        Instructor instructor = new Instructor("Yashraj", "raj@email.com", "202");

        instructor.createCourse("Python Advance");

        //Quiz
        String[] questions = {
                "What is OOPS?",
                "What is inheritance?",
                "What is polymorphism?"
        };

        int[] correctAnswers = {1, 1, 3};

        Quiz quiz = new Quiz(questions, correctAnswers, 2);

        int[] userAnswers = {1, 2, 1};
        quiz.evaluateQuiz(userAnswers);
        quiz.displayResult();

        //Polymorphism in certificate generation
        learner1.generateCertificate();
        learner2.generateCertificate();
    }
}