/*14. "LoanBuddy – Loan Approval Automation"
Story: A fintech startup named FinlyTech is launching a product called LoanBuddy, a web and
mobile app that automates personal loan approvals for salaried and self-employed applicants.
LoanBuddy should collect applicant data, verify eligibility, evaluate credit risk, and either
approve or reject the loan based on custom rules. It also calculates monthly EMIs and provides
a personalized repayment plan.
You’re hired as a Java backend developer to design and implement the core loan approval
engine.
Requirements:
● Applicant class: name, creditScore, income, loanAmount.
● LoanApplication class with loan type, term, and interest rate.
● Interface IApprovable with approveLoan() and calculateEMI().
● Use constructors to support different types of loans (personal, home, auto).
● Operators for EMI calculation: P × R × (1+R)^N / ((1+R)^N – 1)
● Encapsulation: keep credit score and internal approval logic private.
● Inheritance: different loan types (HomeLoan, AutoLoan) extending base class.
● Polymorphism: EMI calculation logic varies by loan type.
● Access modifiers to limit loan status changes to internal processes only.*/

package com.dayfive.loanbuddy;

import java.util.Scanner;

public class LoanBuddyLoanApprovalAutomation {
	
	public static void main(String args[] ){
		
		Scanner input = new Scanner (System.in);
		System.out.println("========= Welcome to LoanBuddy =========");
		System.out.println("----- Enter Applicant Details ----- ");
		System.out.print("Enter Applicant Name: ");
		String name = input.nextLine();
		System.out.print("Enter Applicant credit score: ");
		int creditScore = input.nextInt();
		System.out.println("Enter Applicant income: ");
		double income = input.nextDouble();
		System.out.println("Enter Applicant Loan Amount: ");
		double loanAmount = input.nextDouble();
		
		Applicant applicant = new Applicant (name, creditScore, income, loanAmount);
		
		System.out.println("Choose loan Type:\n1. Home Loan\n2. Auto Loan\n");
		System.out.print("Enter your choice: ");
		int choice = input.nextInt();
		
		System.out.print("Enter Loan Term (months): ");
        int term = input.nextInt();
        
        LoanApplication obj;

        switch (choice) {
            case 1:
                obj = new HomeLoan(applicant, term);
                break;

            case 2:
                obj = new AutoLoan(applicant, term);
                break;

            default:
                System.out.println("Invalid Loan Type");
                input.close();
                return;
        }
        
		if (obj.approveLoan()) {
            System.out.println("\nLoan Approved (" + obj.getLoanType() + ")");
            System.out.println("Monthly EMI: Rs." + String.format("%.2f", obj.calculateEMI()));
        } else {
            System.out.println("\n Loan Rejected due to eligibility criteria.");
        }
		
	}

}
