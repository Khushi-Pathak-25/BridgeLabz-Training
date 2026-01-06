package com.queues.circulartourproblem;

public class MainCircularTourProblem {

    public static void main(String[] args) {

        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int start = CircularTour.findStartingPump(petrol, distance);

        if (start == -1) {
            System.out.println("No circular tour possible.");
        } else {
            System.out.println("Start at petrol pump index: " + start);
        }
    }
}