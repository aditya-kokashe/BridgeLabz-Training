package com.day4.EduMentor;

public class Quiz {

    private String[] questions;        // internal question bank (private)
    private final int[] answers;        // encapsulated, cannot be modified
    private int score;
    private int difficultyLevel;

    // Constructor with difficulty
    public Quiz(String[] questions, int[] answers, int difficultyLevel) {
        this.questions = questions;
        this.answers = answers;
        this.difficultyLevel = difficultyLevel;
        this.score = 0;
    }

    // Evaluate quiz using operators
    public void evaluateQuiz(int[] userAnswers) {
        for (int i = 0; i < answers.length; i++) {
            if (userAnswers[i] == answers[i]) {
                score++;
            }
        }
    }

    // Percentage calculation
    public double calculatePercentage() {
        return (score * 100.0) / answers.length;
    }

    public void displayResult() {
        System.out.println("Score: " + score + "/" + answers.length);
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("Difficulty Level: " + difficultyLevel);
    }
}