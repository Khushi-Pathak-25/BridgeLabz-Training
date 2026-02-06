
package com.multithreading.threadstatemonitor;

public class ThreadStateMonitoringSystem {

    public static void main(String[] args) {

        TaskRunner task1 = new TaskRunner("Task-1");

        StateMonitor monitor = new StateMonitor(task1);

        monitor.start();
        task1.start();
    }
}
