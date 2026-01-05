package com.linkedlists.circular.taskscheduler;

public class TaskNode {

    int taskId;
    String taskName;
    int priority;
    String dueDate;
    TaskNode next;

    // Constructor
    TaskNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}