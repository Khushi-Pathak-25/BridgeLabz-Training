package com.queues.circulartourproblem;

public class CircularTour {

    // Returns starting pump index or -1 if not possible
    public static int findStartingPump(int[] petrol, int[] distance) {

        int n = petrol.length;
        Queue queue = new Queue(n);

        int surplus = 0;
        int start = 0;

        // Try each pump once
        for (int i = 0; i < n; i++) {

            surplus += petrol[i] - distance[i];
            queue.enqueue(i);

            // If surplus becomes negative, reset
            while (surplus < 0 && !queue.isEmpty()) {
                int removed = queue.dequeue();
                surplus -= petrol[removed] - distance[removed];
                start = removed + 1;
            }
        }

        return surplus >= 0 ? start : -1;
    }
}