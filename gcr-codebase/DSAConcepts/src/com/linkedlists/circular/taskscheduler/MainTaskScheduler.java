/*3. Circular Linked List: Task Scheduler
Problem Statement: Create a task scheduler using a circular linked list. 
Each node in the list represents a task with Task ID, Task Name, Priority, and Due Date.
Implement the following functionalities:
Add a task at the beginning, end, or at a specific position in the circular list.
Remove a task by Task ID.
View the current task and move to the next task in the circular list.
Display all tasks in the list starting from the head node.
Search for a task by Priority.
Hint:
Use a circular linked list where the last node’s next pointer points back to the first node, 
creating a circular structure.
Ensure that the list loops when traversed from the head node, so tasks can be revisited in a circular manner.*/

package com.linkedlists.circular.taskscheduler;

public class MainTaskScheduler {

    public static void main(String[] args) {

        TaskCircularLinkedList scheduler = new TaskCircularLinkedList();

        scheduler.addEnd(1, "Designing", 1, "2025-12-15");
        scheduler.addEnd(2, "Implement Code", 2, "2025-12-16");
        scheduler.addEnd(3, "Testing", 1, "2025-12-17");

        scheduler.addAtPosition(1, 4, "Code Review", 2, "2025-12-18");

        System.out.println("All Tasks:");
        scheduler.displayAll();

        System.out.println("Current Task Cycle:");
        scheduler.viewCurrentAndMoveNext();
        scheduler.viewCurrentAndMoveNext();
        scheduler.viewCurrentAndMoveNext();

        System.out.println("Search by Priority 1:");
        scheduler.searchByPriority(1);

        System.out.println("Remove Task ID 2:");
        scheduler.removeByTaskId(2);

        System.out.println("Final Task List:");
        scheduler.displayAll();
    }
}
