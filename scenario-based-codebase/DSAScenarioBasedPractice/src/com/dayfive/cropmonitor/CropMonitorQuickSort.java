package com.dayfive.cropmonitor;

public class CropMonitorQuickSort {
	
	public static void quickSort(SensorReading data[], int low, int high) {
		
		if(low<high) {
			// Partition index
			int pivotIndex = partition(data,low,high);
			
			// recursive quick sort
			quickSort(data, low, pivotIndex-1);
			quickSort(data, pivotIndex+1, high);
		}
	
	}
	
	// partition logic
	public static int partition(SensorReading data[], int low, int high) {

		long pivot = data[high].timestamp;
		int i = low-1;
		
		for(int j = low; j<high; j++) {
			if(data[j].timestamp<pivot) {
				i++;
				// Swap data[i] and data[j]
				SensorReading temp = data[i];
				data[i] = data[j];
				data[j]= temp;
			}
		}
		i++;
		SensorReading temp = data[i];
		data[i] = data[high];
		data[high] = temp;
		
		return i;
	}
	
	 // display sorted sensor data
    public static void display(SensorReading[] data) {
        for (SensorReading reading : data) {
            System.out.println( "Timestamp: " + reading.timestamp +
                " | Temperature: " + reading.temperature
            );
        }
    }

}
