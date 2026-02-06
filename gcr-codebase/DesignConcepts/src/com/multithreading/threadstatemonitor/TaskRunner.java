package com.multithreading.threadstatemonitor;

class TaskRunner extends Thread {

    public TaskRunner(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 1_000_000; i++) {
                int x = i * i;
            }

            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
