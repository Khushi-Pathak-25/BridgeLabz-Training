package com.interfaces.functional.stringlength;

import java.util.function.Function;

public class MessageValidator {
    private String message;

    // constructor
    public MessageValidator(String message) {
        this.message = message;
    }

    // checks if message length exceeds limit using given Function
    public void validateLength(Function<String, Integer> lengthFunction, int maxLimit) {
        int length = lengthFunction.apply(message);

        System.out.println("Message: \"" + message + "\"");
        System.out.println("Length computed: " + length + " characters");

        if (length > maxLimit) {
            System.out.println("--> WARNING: Message exceeds the allowed limit of " + maxLimit + " characters!");
        } else {
            System.out.println("--> Message is within the allowed limit (" + maxLimit + " characters).");
        }
    }

    // good string representation
    @Override
    public String toString() {
        return "MessageValidator[message=\"" + message + "\", length=" + message.length() + "]";
    }
}