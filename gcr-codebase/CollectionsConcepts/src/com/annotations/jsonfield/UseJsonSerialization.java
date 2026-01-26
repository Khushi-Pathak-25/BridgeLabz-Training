package com.annotations.jsonfield;

public class UseJsonSerialization {
    public static void main(String[] args) {
        User user = new User("Ringo", 25);
        
        String json = JsonSerializer.toJson(user);
        System.out.println(json);
    }
}