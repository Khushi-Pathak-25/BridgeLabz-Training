/* 8. CropMonitor – Sensor Data Ordering (Quick Sort)
Story: An agri-tech firm uses drone sensors that record soil temperatures at random intervals.
The large data needs to be sorted quickly by timestamp before visualization. Quick Sort is
chosen due to its fast average performance.
Key Concepts:
● Unordered sensor data
● High-speed sorting
● Quick partitioning based on timestamps*/

package com.dayfive.cropmonitor;

public class MainCropMonitor {
	
	 public static void main(String[]args) {
	 SensorReading[] sensorData = {
	            new SensorReading(150006708, 28.5),
	            new SensorReading(169999040, 26.3),
	            new SensorReading(170000000, 27.1),
	            new SensorReading(169999940, 25.9),
	            new SensorReading(170000600, 28.0)
	        };
	 
	        System.out.println("---------- Before Sorting -----------");
	        CropMonitorQuickSort.display(sensorData);

	        CropMonitorQuickSort.quickSort(sensorData, 0, sensorData.length - 1);

	        System.out.println("\n------- After Sorting (By Timestamp) ----------");
	      
	        CropMonitorQuickSort. display(sensorData);
	        
	 }

}
