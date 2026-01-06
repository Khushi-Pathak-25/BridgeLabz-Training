package com.dayfour.personalizedlearningplatform;

public class Quiz {
	
	// fields for questions, answers, and score
	private String questions[];
	private final char answer[];// can not be modified 
	private int score;
	
	public Quiz(String[] questions, char[] answer) {
		this.questions = questions;
		this.answer = answer;
	}
	// Score calculation
	public int calculateScore(char answer[],char userAnswer[]) {
		score =0;
		for (int i = 0; i < answer.length && i < userAnswer.length; i++) {
            if (Character.toUpperCase(answer[i]) == 
                Character.toUpperCase(userAnswer[i])) {
                score++;
            }
        }
		return score;
	}
	
	public double calculatePercent(int score) {
		double percentage = score*100.0 / answer.length;
		
		return percentage;
		
	}	
    
}
