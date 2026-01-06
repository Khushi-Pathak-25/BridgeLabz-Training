package com.queues.slidingwindowmaximum;

public class MainSlidingWindowMaximum {

    public static void main(String[] args) {

        int[] array = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] result = SlidingWindow.findMaxInWindows(array, k);

        System.out.println("Sliding Window Maximums:");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}