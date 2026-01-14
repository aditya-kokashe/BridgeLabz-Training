package com.day3.ExamProctor;

import java.util.*;
public class Navigation {

	Stack<Integer> questionStack = new Stack<>();
	HashMap<Integer, String> answers = new HashMap<>();
	
	public void navigateTo(int qid) {
		questionStack.push(qid);
	}
	
	public int currentQuestion() {
		if(questionStack.isEmpty()) {
			throw new EmptyStackException();
		}
		return questionStack.peek();
	}
	
	public void submitAnswer(String answer) {
		int currentQid = currentQuestion();
		answers.put(currentQid, answer);
	}
	
	public int calculateScore(HashMap<Integer, Questions> questionBank) {
		int totalScore = 0;
		for(int qid : answers.keySet()) {
			String studentAns = answers.get(qid);
			Questions q = questionBank.get(qid);
			if(q != null && studentAns.equals(q.answer)) {
				totalScore += q.correctScore;
			}
		}
		return totalScore;
	}
}
