package com.junit.databaseconnection;

public class DatabaseConnection {
    private boolean isConnected = false;

    public void connect() {
        isConnected = true;
    }

    public void disconnect() {
        isConnected = false;
    }

    public boolean isConnected() {
        return isConnected;
    }
}