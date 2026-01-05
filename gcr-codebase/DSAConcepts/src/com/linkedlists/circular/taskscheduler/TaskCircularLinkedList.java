package com.linkedlists.circular.taskscheduler;

public class TaskCircularLinkedList {

    private TaskNode head;
    private TaskNode tail;
    private TaskNode current;

    // add task at first
    public void addFirst(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = tail = current = newNode;
            newNode.next = newNode;
            return;
        }

        newNode.next = head;
        tail.next = newNode;
        head = newNode;
    }

    // Add task at end
    public void addEnd(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = tail = current = newNode;
            newNode.next = newNode;
            return;
        }

        newNode.next = head;
        tail.next = newNode;
        tail = newNode;
    }

    // Add task at specific position (0-based index)
    public void addAtPosition(int index, int id, String name, int priority, String dueDate) {

        if (index < 0) {
            System.out.println("Invalid index.");
            return;
        }

        if (index == 0) {
            addFirst(id, name, priority, dueDate);
            return;
        }

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        TaskNode temp = head;
        for (int i = 0; i < index - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        if (temp.next == head) {
            addEnd(id, name, priority, dueDate);
            return;
        }

        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove task by task ID
    public void removeByTaskId(int id) {

        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        TaskNode temp = head;
        TaskNode prev = tail;

        do {
            if (temp.taskId == id) {

                if (temp == head && temp == tail) {
                    head = tail = current = null;
                } else {
                    prev.next = temp.next;

                    if (temp == head) head = temp.next;
                    if (temp == tail) tail = prev;
                    if (temp == current) current = temp.next;
                }
                return;
            }
            prev = temp;
            temp = temp.next;

        } while (temp != head);

        System.out.println("Task not found.");
    }

    // view current task and move to next
    public void viewCurrentAndMoveNext() {

        if (current == null) {
            System.out.println("No tasks available.");
            return;
        }

        displayTask(current);
        current = current.next;
    }

    // display all tasks starting from head
    public void displayAll() {

        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        TaskNode temp = head;
        do {
            displayTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // search tasks by priority
    public void searchByPriority(int priority) {

        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        boolean found = false;
        TaskNode temp = head;

        do {
            if (temp.priority == priority) {
                displayTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tasks found with priority " + priority);
        }
    }

    // method to display a task
    private void displayTask(TaskNode node) {
        System.out.println("Task ID   : " + node.taskId);
        System.out.println("Name      : " + node.taskName);
        System.out.println("Priority  : " + node.priority);
        System.out.println("Due Date  : " + node.dueDate);
        System.out.println("--------------------------");
    }
}
