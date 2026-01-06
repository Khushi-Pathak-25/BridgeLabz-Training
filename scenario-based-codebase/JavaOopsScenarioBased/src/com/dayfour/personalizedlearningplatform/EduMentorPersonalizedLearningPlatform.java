/*10. "EduMentor – Personalized Learning Platform"
Story: EduMentor is an AI-based learning platform. You're tasked with implementing the module
to manage courses, quizzes, and learner progress.
Requirements:
● User base class: name, email, userId.
● Learner and Instructor inherit from User.
● ICertifiable interface with method generateCertificate().
● Quiz class: fields for questions, answers, and score.
● Use constructors to create quizzes with variable difficulty.
● Encapsulation for quiz answers (can’t be modified once set).
● Use operators to score the quiz and generate a percentage.
● Polymorphism: generateCertificate() works differently for short courses vs
full-time.
● Apply access modifiers: internal question banks must remain private.*/

package com.dayfour.personalizedlearningplatform;

import java.util.Scanner;
public class EduMentorPersonalizedLearningPlatform {

	public static void main(String[]args) {
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("====== Welcome to EduMentor======\n");
	    
	    // Instructor input
	    System.out.println("---------Enter Instructor Details------");
	    System.out.print("Enter Instructor ID: ");
	    String insID = input.nextLine();
	    
	    System.out.print("Enter Instructor Name: ");
	    String insName = input.nextLine();
	    
	    System.out.print("Enter Instructor Mail: ");
	    String insMail = input.nextLine();
	    
	    User p1 = new Instructor(insID, insName, insMail);
	    p1.displayUser();
	    
	    // Learner input
	    System.out.println("---------Enter Learner Details------");
	    System.out.print("Enter Learner ID: ");
	    String lerID = input.nextLine();
	    
	    System.out.print("Enter Learner Name: ");
	    String lerName = input.nextLine();
	    
	    System.out.print("Enter Learner Mail: ");
	    String lerMail = input.nextLine();
	    
	    User p2 = new Learner(lerID, lerName, lerMail);
		p2.displayUser();
		// Course Detail
	    System.out.println("---------Enter Course Details------");
	    System.out.println("Choose Course: 1. Short Course  2.Full-Time Course");
	    System.out.print("Enter your choice:");
	    int userChoice = input.nextInt();
	    input.nextLine(); // clear buffer
	    
	    switch(userChoice) {
	    
	        case 1 :
	        	System.out.print("Enter Course Name: ");
	        	String sName = input.nextLine();
	        	System.out.print("Enter Course ID: ");
	        	String sID = input.nextLine();
	        	ShortCourse c1 = new ShortCourse(sName, sID);
	        	c1.generateCertificate();
	        	
	            break;
	            
	        case 2 :
	        	System.out.print("Enter Course Name: ");
	        	String fName = input.nextLine();
	        	System.out.print("Enter Course ID: ");
	        	String fID = input.nextLine();
	        	FullTime c2 = new FullTime(fName, fID);
	        	c2.generateCertificate();
	        	
	            break;                 
	    }
	    
	    // Quiz inputs
	    System.out.println("---------Enter Quiz Details------");
	    String question []= {"1. Who developed Java?\nA.James Gosling\nB.James Carnel\n",
	    		             "2. When was Java develop?\nA.1919\nB.1991\n",
	    		             "3. Java is _____ language?\nA.OOP\nB.POP"};
	    char answer []= {'A','B','A'};
	    
	    for(int i = 0 ; i<question.length; i++) {
	    	System.out.println(question[i]);
	    }
	    
	    char userAnswer[]= new char[question.length];
	    
	    System.out.print("Enter your answers: ");
	    for(int i = 0 ; i<userAnswer.length; i++) {
	    	userAnswer[i]= input.next().charAt(0);
	    }
	    Quiz q1 = new Quiz(question,answer);
	    
	    int score= q1.calculateScore(answer,userAnswer);
	    
	    double percentage= q1.calculatePercent(score);
	    
	    System.out.println("Percentage :"+percentage);
	    
	    input .close();
	}
	
}
