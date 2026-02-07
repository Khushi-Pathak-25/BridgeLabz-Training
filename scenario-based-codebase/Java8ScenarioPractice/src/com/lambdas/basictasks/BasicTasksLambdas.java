package com.lambdas.basictasks;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BasicTasksLambdas {

    public static void main(String[] args) {

        // 1. Run task in separate thread
        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread task: " + i);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        System.out.println("1. Running task in thread...");
        new Thread(task).start();

        // Wait a bit so output doesn't mix too much
        try {
            Thread.sleep(1800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 2. Print numbers from list
        List<Integer> numbers = Arrays.asList(10, 23, 4, 67, 89, 12);
        Consumer<Integer> printNum = n -> System.out.print(n + " ");
        System.out.println("\n2. Numbers in list:");
        numbers.forEach(printNum);

        // 3. Even/Odd check
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("\n\n3. Even/Odd check:");
        numbers.forEach(n -> System.out.println(n + " -> " + (isEven.test(n) ? "Even" : "Odd")));

        // 4. Add two numbers
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("\n4. Addition:");
        System.out.println("7 + 13 = " + add.apply(7, 13));

        // 5. Greater of two numbers
        BiFunction<Integer, Integer, Integer> max = (a, b) -> a > b ? a : b;
        System.out.println("\n5. Greater number:");
        System.out.println("45 & 78 ==> " + max.apply(45, 78));
    }
}