package com.generics.resumescreening;

public abstract class JobRole {

	protected String roleName;

	// Constructor
	public JobRole(String roleName) {
		this.roleName = roleName;
	}

	// Each role must define its own screening logic
	public abstract void screenResume();
}
