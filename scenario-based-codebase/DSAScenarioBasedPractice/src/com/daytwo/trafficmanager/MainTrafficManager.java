/*7. TrafficManager – Roundabout Vehicle Flow (Circular Linked List +
Queue)
Story: A smart city roundabout allows vehicles to enter and exit dynamically. Each vehicle is a
node in a Circular Linked List. A Queue manages vehicles waiting to enter.
Requirements:
● Add or remove cars in a circular path.
● Queue overflow/underflow handling.
● Print state of roundabout at any time.*/

package com.daytwo.trafficmanager;

public class MainTrafficManager {
	
	 public static void main(String[] args) {

		    VehicleCircularLinkedList roundabout = new VehicleCircularLinkedList();
	        WaitingQueue queue = new WaitingQueue(3);

	        queue.enqueue(101);
	        queue.enqueue(102);
	        queue.enqueue(103);

	        roundabout.addVehicle(queue.dequeue());     /*int carNumber = queue.dequeue();	                                                       roundabout.addCar(carNumber);*/
	        roundabout.addVehicle(queue.dequeue());

	        roundabout.display();

	        roundabout.removeVehicle(); // Remove head car (first entered)
	      
	        roundabout.display();
	 }
	
}
