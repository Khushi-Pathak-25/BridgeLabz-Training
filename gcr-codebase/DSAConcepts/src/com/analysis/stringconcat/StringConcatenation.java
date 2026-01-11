package com.analysis.stringconcat;

public class StringConcatenation {
    public static String concatenate(int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result = result + "A";
        }
        return result;
    }
}