package com.annotations.roleallowed;

public class UseRoleAllowed {
    public static void main(String[] args) {
        UserContext user = new UserContext("USER");
        invokeWithRoleCheck(user, AdminService.class);
    }

    // Checks role before invoking class methods
    private static void invokeWithRoleCheck(UserContext user, Class<?> clazz) {
        if (clazz.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed roleAllowed = clazz.getAnnotation(RoleAllowed.class);
            
            if (!user.getRole().equals(roleAllowed.value())) {
                System.out.println("Access Denied!");
                return;
            }
        }

        try {
            Object obj = clazz.getDeclaredConstructor().newInstance();
            clazz.getDeclaredMethods()[0].invoke(obj);

        } catch (Exception e) {
            System.out.println("Invocation failed.");
        }
    }
}