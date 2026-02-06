package com.multithreading.threadstatemonitor;

import java.time.LocalTime;
import java.util.LinkedHashSet;
import java.util.Set;

class StateMonitor extends Thread {

    private Thread task;
    private Set<Thread.State> observedStates = new LinkedHashSet<>();

    public StateMonitor(Thread task) {
        this.task = task;

        // Add NEW STATE 
        observedStates.add(task.getState());

        System.out.println("[Monitor] " + task.getName() +
                " is in " + task.getState() +
                " state at " + LocalTime.now());
    }

    @Override
    public void run() {

        Thread.State lastState = task.getState();

        while (true) {
            Thread.State currentState = task.getState();

            if (currentState != lastState) {
                observedStates.add(currentState);

                System.out.println("[Monitor] " + task.getName() +
                        " is in " + currentState +
                        " state at " + LocalTime.now());

                lastState = currentState;
            }

            if (currentState == Thread.State.TERMINATED) {
                break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Summary: " + task.getName() +
                " went through " + observedStates.size() + " states");
    }
}
