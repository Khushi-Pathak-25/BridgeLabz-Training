package com.stacks.stockspanproblem;

public class StockSpan {

    // Calculates stock span for each day
    public static int[] calculateSpan(int[] prices) {

        int n = prices.length;
        int[] span = new int[n];
        Stack stack = new Stack(n);

        // First day span is always 1
        span[0] = 1;
        stack.push(0);

        // Process remaining days
        for (int i = 1; i < n; i++) {

            // Remove indices with smaller or equal price
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // Calculate span
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push current index
            stack.push(i);
        }

        return span;
    }
}
