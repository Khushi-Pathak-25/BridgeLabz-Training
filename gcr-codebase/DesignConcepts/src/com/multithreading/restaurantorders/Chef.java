package com.multithreading.restaurantorders;

public class Chef extends Thread {

    private String dishName;
    private int totalTime; // in milliseconds

    public Chef(String chefName, String dishName, int totalTime) {
        super(chefName);   // set thread name
        this.dishName = dishName;
        this.totalTime = totalTime;
    }

    @Override
    public void run() {

        System.out.println(getName() + " started preparing " + dishName);

        int[] progress = {25, 50, 75, 100};

        for (int p : progress) {
            try {
                Thread.sleep(totalTime / 4); // divide time into 4 parts
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(getName() + " preparing " + dishName + ": " + p + "% complete");
        }

        System.out.println(getName() + " finished preparing " + dishName);
    }
}
