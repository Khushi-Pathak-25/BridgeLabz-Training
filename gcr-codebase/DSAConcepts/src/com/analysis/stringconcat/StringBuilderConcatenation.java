package com.analysis.stringconcat;

public class StringBuilderConcatenation {

    public static String concatenate(int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append("A");
        }
        return sb.toString();
    }
}
