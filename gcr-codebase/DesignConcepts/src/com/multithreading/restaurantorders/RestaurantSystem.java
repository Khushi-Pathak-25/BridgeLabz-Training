package com.multithreading.restaurantorders;

public class RestaurantSystem {

    public static void main(String[] args) throws InterruptedException {

        Chef c1 = new Chef("Chef-1", "Pizza", 3000);
        Chef c2 = new Chef("Chef-2", "Pasta", 2000);
        Chef c3 = new Chef("Chef-3", "Salad", 1000);
        Chef c4 = new Chef("Chef-4", "Burger", 2500);

        c1.start();
        c2.start();
        c3.start();
        c4.start();

        // Manager waits for all chefs
        c1.join();
        c2.join();
        c3.join();
        c4.join();

        System.out.println("Kitchen closed - All orders completed");
    }
}
