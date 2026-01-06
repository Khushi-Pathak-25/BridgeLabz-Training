package com.stacks.sortstackusingrecursion;

public class SortStack {

    // Sorts the stack using recursion
    public static void sort(Stack stack) {
        // Base case
        if (stack.isEmpty()) {
            return;
        }

        // Remove top element
        int temp = stack.pop();

        // Sort remaining stack
        sort(stack);

        // Insert element at correct position
        insertSorted(stack, temp);
    }

    // Inserts element into sorted stack
    private static void insertSorted(Stack stack, int value) {

        // Insert if stack is empty or value is greater
        if (stack.isEmpty() || value > stack.peek()) {
            stack.push(value);
            return;
        }

        // Remove top and recurse
        int temp = stack.pop();
        insertSorted(stack, value);

        // Put back removed element
        stack.push(temp);
    }
}