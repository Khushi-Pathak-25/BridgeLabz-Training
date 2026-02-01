package com.streams.foreach;

import java.util.*;

public class IoTSensorReadings {
    public static void main(String[] args) {

        // List of sensor readings (example values)
        List<Double> sensorReadings = Arrays.asList(
            25.5, 30.2, 18.9, 35.6, 22.4, 40.1
        );

        // Threshold value
        double threshold = 30.0;

        // Stream processing
        sensorReadings.stream()

            // Filter readings above threshold
            .filter(reading -> reading > threshold)

            // Print each filtered reading
            .forEach(reading -> System.out.println("High Sensor Reading: " + reading));
    }
}
