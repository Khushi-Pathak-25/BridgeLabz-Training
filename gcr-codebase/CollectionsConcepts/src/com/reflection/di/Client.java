package com.reflection.di;

public class Client {
    @Inject
    private Service service;

    public void run() {
	service.execute();
    }
}