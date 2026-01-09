package com.searching.strings;

public class StringBufferConcatenateStrings {

    // Concatenates array of strings using StringBuffer
    public static String concatenateStrings(String[] arr) {

        StringBuffer buffer = new StringBuffer();

        // Append each string to StringBuffer
        for (int i = 0; i < arr.length; i++) {
            buffer.append(arr[i]);
        }

        return buffer.toString();
    }

    public static void main(String[] args) {

        String[] arr = {"Java", " ", "is", " ", "plateform", " ","independent","."};

        String result = concatenateStrings(arr);

        System.out.println("Concatenated String:");
        System.out.println(result);
    }
}
