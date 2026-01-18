package com.dayten.bagballs;

import java.util.ArrayList;

public class Bag implements Storable {

    private int bagId;
    private int capacity;
    private ArrayList<Ball> balls;   // composition

    public Bag(int bagId, int capacity) {
        this.bagId = bagId;
        this.capacity = capacity;
        this.balls = new ArrayList<>();
    }

    // add balls
    public void addBall(Ball ball) {
        if (balls.size() < capacity) {
            balls.add(ball);
            System.out.println("Ball added to Bag " + bagId);
        } else {
            System.out.println("Bag is full! Cannot add ball.");
        }
    }

    // remove balls
    public void removeBall() {
        if (!balls.isEmpty()) {
            balls.remove(balls.size() - 1);
            System.out.println("Ball removed from Bag " + bagId);
        } else {
            System.out.println("Bag is empty!");
        }
    }

    // display all balls
    public void displayBalls() {
        if (balls.isEmpty()) {
            System.out.println("No balls in Bag " + bagId);
        } else {
            for (Ball b : balls) {
                b.display();
            }
        }
    }
    
    // get total number of balls
    public int getBallCount() {
        return balls.size();
    }

    @Override
    public void display() {
        System.out.println("Bag ID: " + bagId + ", Ball Count: " + balls.size());
    }
}
