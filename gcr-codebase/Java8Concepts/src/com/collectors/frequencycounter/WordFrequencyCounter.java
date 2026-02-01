package com.collectors.frequencycounter;

import java.util.*;
import java.util.stream.Collectors;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String paragraph = "java is easy and java is powerful and java is popular";

        // Convert paragraph into words
        Map<String, Integer> wordCount =
                Arrays.stream(paragraph.split("\\s+"))
                        .collect(Collectors.toMap(
                                word -> word,      // key = word
                                word -> 1,         // value = 1
                                Integer::sum       // merge function
                        ));

        // Print result
        System.out.println("Word Frequency:");
        wordCount.forEach((word, count) ->
                System.out.println(word + " -> " + count)
        );
    }
}
