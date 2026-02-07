package com.functional.supplier;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Supplier;

public class Scenario4_Supplier {
    public static void main(String[] args) {

        // 1. Generate OTP (6 digits)
        Supplier<String> otpGenerator = () -> {
            int otp = 100000 + new Random().nextInt(900000);
            return String.valueOf(otp);
        };
        System.out.println("1. OTP: " + otpGenerator.get());

        // 2. Random student ID (STU-XXXX)
        Supplier<String> studentId = () -> "STU-" + (1000 + new Random().nextInt(9000));
        System.out.println("2. Student ID: " + studentId.get());

        // 3. Current date-time
        Supplier<LocalDateTime> now = LocalDateTime::now;
        System.out.println("3. Current time: " + now.get());

        // 4. Default welcome message
        Supplier<String> welcome = () -> "Hello! Welcome to our application.";
        System.out.println("4. " + welcome.get());

        // 5. Random discount coupon (10-50%)
        Supplier<Integer> discount = () -> 10 + new Random().nextInt(41);
        System.out.println("5. Your discount coupon: " + discount.get() + "% OFF");
    }
}