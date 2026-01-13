package com.daytwo.trafficmanager;

public class VehicleNode {

	protected int numOfVehicle;
	protected VehicleNode next;
	
	public VehicleNode(int numOfVehicle) {
		this.numOfVehicle = numOfVehicle;
		this.next = null;
	}	
}
