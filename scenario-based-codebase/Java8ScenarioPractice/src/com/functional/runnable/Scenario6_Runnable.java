package com.functional.runnable;

public class Scenario6_Runnable {
    public static void main(String[] args) {

        // 1. Background task
        Runnable backgroundTask = () -> {
            System.out.println("Background task started...");
            try {
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Background task completed.");
        };
        new Thread(backgroundTask).start();

        // 2. File cleanup simulation
        Runnable cleanup = () -> System.out.println("Cleaning up temporary files...");
        cleanup.run();

        // 3. Print message in separate thread
        Runnable printer = () -> {
            for (int i = 1; i <= 4; i++) {
                System.out.println("Thread message " + i);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        new Thread(printer).start();

        // Wait a bit so we can see output
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}