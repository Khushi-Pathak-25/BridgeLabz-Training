package com.reflection.jsongenerator;

public class UseJsonGenerator {
    public static void main(String[] args) {
	User user = new User("Ringo", 25);
	
	String json = JsonUtil.toJson(user);
	System.out.println(json);
    }
}