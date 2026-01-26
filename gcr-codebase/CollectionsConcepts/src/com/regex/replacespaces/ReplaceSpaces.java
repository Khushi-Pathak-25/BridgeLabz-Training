package com.regex.replacespaces;

public class ReplaceSpaces {
	
    public static void main(String[] args) {
        String text = "This   is   an    example   with    multiple spaces.";

        // Replace multiple whitespaces with single one space
        String result = text.replaceAll("\\s+", " ");
        
        System.out.println(result);
    }
}