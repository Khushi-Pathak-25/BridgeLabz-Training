package com.annotations.roleallowed;

public class UserContext {
    private String role;

    // constructor
    public UserContext(String role) {
        this.role = role;
    }

    // getter
    public String getRole() {
        return role;
    }
}