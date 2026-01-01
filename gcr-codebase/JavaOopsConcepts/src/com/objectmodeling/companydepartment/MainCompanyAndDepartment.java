/*Problem 3: Company and Departments (Composition)
Description: A Company has several Department objects, 
and each department contains Employee objects.
Model this using composition, where deleting a company should also 
delete all departments and employees.
Tasks:
Define a Company class that contains multiple Department objects.
Define an Employee class within each Department.
Show the composition relationship by ensuring that when a Company object is deleted,
 all associated Department and Employee objects are also removed.*/

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

