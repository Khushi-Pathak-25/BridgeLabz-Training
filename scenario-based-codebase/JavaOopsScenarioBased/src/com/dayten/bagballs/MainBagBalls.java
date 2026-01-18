package com.dayten.bagballs;

import java.util.ArrayList;

public class MainBagBalls {

    public static void main(String[] args) {

        ArrayList<Bag> bags = new ArrayList<>();

        Bag bag1 = new Bag(1, 2);
        Bag bag2 = new Bag(2, 3);

        bags.add(bag1);
        bags.add(bag2);

        Ball b1 = new Ball(101, "Red");
        Ball b2 = new Ball(102, "Blue");
        Ball b3 = new Ball(103, "Green");

        bag1.addBall(b1);
        bag1.addBall(b2);
        bag1.addBall(b3);   // will not add (bag1 full bcz capacity of bag 1 is 2)

        bag2.addBall(b3);

        System.out.println("\n--- Balls in Bag 1 ---");
        bag1.displayBalls();

        bag1.removeBall();

        System.out.println("\n--- All Bags ---");
        for (Bag bag : bags) {
            bag.display();
        }
    }
}
