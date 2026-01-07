package com.dayfive.parkease;

import java.util.ArrayList;

public class ParkingManager {

    private ArrayList<String> bookingLogs = new ArrayList<>();

    public void addLog(String log) {
        bookingLogs.add(log);
    }

    public void showLogs() {
        System.out.println("---- Parking Logs ----");
        for (String log : bookingLogs) {
            System.out.println(log);
        }
    }
}
