package com.generics.resumescreening;

import java.util.List;

public class ScreeningUtil {

	// Generic method to screen a single resume
	public static <T extends JobRole> void screenSingleResume(Resume<T> resume) {
		resume.processResume();
	}

	// Wildcard method to screen multiple job roles
	public static void screenAllRoles(List<? extends JobRole> roles) {
		for (JobRole role : roles) {
			role.screenResume();
		}
	}
}
