package com.dayfour.eventmanager;

public class Ticket {
    int price;

    // constructor
    Ticket(int price) {
        this.price = price;
    }

    void display() {
        System.out.print("Rs."+price + " ");
    }
}
