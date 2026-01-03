/*5. Smart Home Automation System
Scenario: Users can control appliances like lights, fans, ACs via a smart interface.
Concepts Used:
● Class: Appliance, Light, Fan, AC, UserController

Scenario-based Problems

● Constructor: Set default or user-defined power settings
● Access Modifiers: Internal device settings as private, toggle methods as public
● Interface: Controllable with methods turnOn(), turnOff()
● Operators: Compare energy usage (>, <, ==)
● OOP:
○ Encapsulation: Control internal appliance state
○ Abstraction: Devices follow common control interface
○ Inheritance: Device types inherit from Appliance
○ Polymorphism: Turning on a Light vs an AC involves different behaviors*/

package com.dayone.smarthomeautomationsystem;

public class MainSmartHomeAutomationSystem {

    public static void main(String[] args) {

        Appliance light = new Light();
        Appliance fan = new Fan();
        Appliance ac = new AC();

        light.turnOn();
        fan.turnOn();
        ac.turnOn();

        System.out.println();

        light.showStatus();
        fan.showStatus();
        ac.showStatus();

        System.out.println("\nPower Usage Comparison:");

        if (ac.getPowerUsage() > fan.getPowerUsage()) {
            System.out.println("AC consumes more power than Fan");
        }

        if (fan.getPowerUsage() > light.getPowerUsage()) {
            System.out.println("Fan consumes more power than Light");
        }

        ac.turnOff();
        ac.showStatus();
    }
}
