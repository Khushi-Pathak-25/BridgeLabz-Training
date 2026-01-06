package com.stacks.sortstackusingrecursion;

public class MainSortStackUsingRecursion {

    public static void main(String[] args) {

        Stack stack = new Stack(5);

        stack.push(4);
        stack.push(2);
        stack.push(3);
        stack.push(1);

        System.out.println("Original Stack:");
        stack.display();

        SortStack.sort(stack);

        System.out.println("Sorted Stack (asc):");
        stack.display();
    }
}
