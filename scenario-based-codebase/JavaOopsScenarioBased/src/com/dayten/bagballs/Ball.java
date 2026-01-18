package com.dayten.bagballs;

public class Ball implements Storable {

    private int ballId;
    private String color;

    // constructor
    public Ball(int ballId, String color) {
        this.ballId = ballId;
        this.color = color;
    }

    // getter
    public int getBallId() {
        return ballId;
    }

    @Override
    public void display() {
        System.out.println("Ball ID: " + ballId + ", Color: " + color);
    }
}
