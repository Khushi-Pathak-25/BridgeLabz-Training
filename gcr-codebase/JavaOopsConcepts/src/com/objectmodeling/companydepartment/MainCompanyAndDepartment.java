package com.objectmodeling.companydepartment;
import java.util.Scanner;

public class MainCompanyAndDepartment {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			System.out.print("Enter company name: ");
			String companyName = input.nextLine();
			Company company = new Company(companyName);

			System.out.print("Enter department name: ");
			String deptName = input.nextLine();
			company.addDepartment(deptName);

			System.out.print("Enter employee id: ");
			int empId = input.nextInt();
			input.nextLine();

			System.out.print("Enter employee name: ");
			String empName = input.nextLine();

			company.addEmployeeToDepartment(0, empId, empName);

			company.displayCompany();

			// Deleting company (composition effect)
			company.deleteCompany();

			input.close();
		}
}	

