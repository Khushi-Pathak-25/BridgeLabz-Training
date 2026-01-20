/*5. AI-Driven Resume Screening System
Concepts: Generic Classes, Generic Methods, Bounded Type Parameters, Wildcards
Problem Statement:
Develop an AI-Driven Resume Screening System that can process resumes for different job roles like Software Engineer, 
Data Scientist, and Product Manager while ensuring type safety.
Hints:
Create an abstract class JobRole (SoftwareEngineer, DataScientist, ProductManager).
Implement a generic class Resume<T extends JobRole> to process resumes dynamically.
Use a wildcard method (List<? extends JobRole>) to handle multiple job roles in the screening pipeline.
*/

package com.generics.resumescreening;

import java.util.ArrayList;
import java.util.List;

public class ResumeScreeningApp {
	
	public static void main(String[] args) {

		Resume<SoftwareEngineer> seResume = new Resume<>("Khushi", new SoftwareEngineer());

		Resume<DataScientist> dsResume = new Resume<>("Shagun", new DataScientist());

		Resume<ProductManager> pmResume = new Resume<>("Ringo", new ProductManager());

		// Generic method usage
		ScreeningUtil.screenSingleResume(seResume);
		ScreeningUtil.screenSingleResume(dsResume);
		ScreeningUtil.screenSingleResume(pmResume);

		// Wildcard method usage
		List<JobRole> jobRoles = new ArrayList<>();
		jobRoles.add(new SoftwareEngineer());
		jobRoles.add(new DataScientist());
		jobRoles.add(new ProductManager());

		ScreeningUtil.screenAllRoles(jobRoles);
	}
}
