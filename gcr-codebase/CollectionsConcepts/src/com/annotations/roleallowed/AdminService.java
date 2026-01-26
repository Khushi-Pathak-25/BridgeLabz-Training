package com.annotations.roleallowed;

@RoleAllowed("ADMIN")
public class AdminService {

    // Protected method
    public void performAdminTask() {
        System.out.println("Admin task executed successfully.");
    }
}