package com.queues.slidingwindowmaximum;

public class SlidingWindow {

    // Finds maximum in each window
    public static int[] findMaxInWindows(int[] arr, int k) {

        int n = arr.length;
        int[] result = new int[n - k + 1];
        Deque deque = new Deque(n);
        int resIndex = 0;

        // Process first window
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && arr[deque.getRear()] <= arr[i]) {
                deque.removeRear();
            }
            deque.addRear(i);
        }

        // Process remaining windows
        for (int i = k; i < n; i++) {

            // Store max of previous window
            result[resIndex++] = arr[deque.getFront()];

            // Remove elements outside window
            if (!deque.isEmpty() && deque.getFront() <= i - k) {
                deque.removeFront();
            }

            // Remove smaller elements
            while (!deque.isEmpty() && arr[deque.getRear()] <= arr[i]) {
                deque.removeRear();
            }

            deque.addRear(i);
        }

        // Store max for last window
        result[resIndex] = arr[deque.getFront()];

        return result;
    }
}
