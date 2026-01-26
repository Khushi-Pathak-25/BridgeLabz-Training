package com.reflection.proxy;

public class GreetingImplementation implements Greeting {

    // Overridden Parent's method
    @Override
    public void sayHello() {
        System.out.println("Hello User...");
    }
}