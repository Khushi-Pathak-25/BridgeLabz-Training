package com.annotations.roleallowed;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Class-level annotation to restrict access by role
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface RoleAllowed {

    String value();
}