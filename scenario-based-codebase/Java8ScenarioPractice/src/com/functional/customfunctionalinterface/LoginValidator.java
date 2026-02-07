package com.functional.customfunctionalinterface;

@FunctionalInterface
public interface LoginValidator {
    boolean validate(String username, String password);
}