package com.functional.consumer;

import java.util.function.Consumer;
import java.time.LocalDateTime;

public class Scenario3_Consumer {
    static class Order {
        String id;
        double amount;

        Order(String id, double amount) {
            this.id = id;
            this.amount = amount;
        }
    }

    public static void main(String[] args) {

        // 1. Print student details
        Consumer<String> printStudent = name ->
                System.out.println("Student: " + name + " | Checked at " + System.currentTimeMillis());
        printStudent.accept("Mihika Iyer");

        // 2. Log employee login
        Consumer<String> logLogin = name ->
                System.out.println("[LOG] " + name + " logged in at " + LocalDateTime.now());
        logLogin.accept("Richa Rathi");

        // 3. Order confirmation
        Consumer<Order> orderConfirm = order ->
                System.out.println("Order " + order.id + " confirmed for Rs. " + order.amount);
        orderConfirm.accept(new Order("ORD-111", 2990));

        // 4. Display balance
        Consumer<Double> showBalance = bal ->
                System.out.println("Current balance: Rs. " + String.format("%.2f", bal));
        showBalance.accept(18450.75);

        // 5. Send notification
        Consumer<String> sendNotification = msg ->
                System.out.println("# Notification: " + msg);
        sendNotification.accept("Your password was changed successfully.");
    }
}