/* Problem 2: Smart Home Devices
Description: Create a hierarchy for a smart home system where Device is the superclass and Thermostat is a subclass.
Tasks:
Define a superclass Device with attributes like deviceId and status.
Create a subclass Thermostat with additional attributes like temperatureSetting.
Implement a method displayStatus() to show each device's current settings.
Goal: Understand single inheritance by adding specific attributes to a subclass, keeping the superclass general.
*/

package com.inheritance.singleinheritance.smarthome;

public class MainSmartHome {

	public static void main(String args[]) {
		
		Device d = new Thermostat("TH-111","OF",25);
		
		// demonstrating single inheritance
		d.displayStatus();
		
	}
}
