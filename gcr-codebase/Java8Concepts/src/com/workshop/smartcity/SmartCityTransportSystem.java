package com.workshop.smartcity;

import java.util.*;
import java.util.stream.*;

public class SmartCityTransportSystem {
	
	 public static void main(String[] args) {

	        /*----------------------------------------------
	           TRANSPORT SERVICES LIST
	          ---------------------------------------------- */
	        List<TransportService> services = Arrays.asList(
	                new BusService(),
	                new MetroService(),
	                new TaxiService(),
	                new AmbulanceService()
	        );

	        /* ----------------------------------------------
	            LAMBDA – Filter & Sort Services
	           ---------------------------------------------- */
	        System.out.println("\n--- Sorted by Earliest Departure ---");
	        services.stream()
	                .sorted((s1, s2) -> s1.getDepartureTime() - s2.getDepartureTime())
	                .forEach(TransportService::printServiceDetails);

	        /* ----------------------------------------------
	            FOREACH – Dashboard
	           ---------------------------------------------- */
	        System.out.println("\n--- Live Dashboard ---");
	        services.forEach(s ->
	                System.out.println("Active Service: " + s.getServiceName())
	        );

	        /* ----------------------------------------------
	            FUNCTIONAL INTERFACE – Fare Calculation
	           ---------------------------------------------- */
	        FareCalculator taxiFare = distance -> distance * 15;
	        System.out.println("\nTaxi Fare for 10 km: Rs." + taxiFare.calculateFare(10));

	        /* ----------------------------------------------
	            STATIC METHOD – Distance Calculation
	           ---------------------------------------------- */
	        double distance = GeoUtils.calculateDistance(2, 3, 7, 8);
	        System.out.println("Calculated Distance: " + distance);

	        /* ----------------------------------------------
	            PASSENGER DATA
	           ---------------------------------------------- */
	        List<Passenger> passengers = Arrays.asList(
	                new Passenger("A-B", 30, true),
	                new Passenger("A-B", 30, false),
	                new Passenger("B-C", 120, true),
	                new Passenger("A-C", 50, false)
	        );

	        /* ----------------------------------------------
	            COLLECTORS – groupingBy()
	           ---------------------------------------------- */
	        System.out.println("\n--- Passengers Grouped by Route ---");
	        Map<String, List<Passenger>> byRoute =
	                passengers.stream()
	                        .collect(Collectors.groupingBy(p -> p.route));

	        byRoute.forEach((route, list) ->
	                System.out.println(route + " -> " + list.size() + " passengers")
	        );

	        /* ----------------------------------------------
	            COLLECTORS – partitioningBy()
	           ---------------------------------------------- */
	        System.out.println("\n--- Peak vs Non-Peak Trips ---");
	        Map<Boolean, List<Passenger>> peakPartition =
	                passengers.stream()
	                        .collect(Collectors.partitioningBy(p -> p.peakHour));

	        System.out.println("Peak Trips: " + peakPartition.get(true).size());
	        System.out.println("Non-Peak Trips: " + peakPartition.get(false).size());

	        /* ----------------------------------------------
	            COLLECTORS – summarizingDouble()
	           ---------------------------------------------- */
	        DoubleSummaryStatistics fareStats =
	                passengers.stream()
	                        .collect(Collectors.summarizingDouble(p -> p.fare));

	        System.out.println("\n--- Revenue Report ---");
	        System.out.println("Total Revenue: Rs." + fareStats.getSum());
	        System.out.println("Average Fare: Rs." + fareStats.getAverage());
	        System.out.println("Maximum Fare: Rs." + fareStats.getMax());

	        /* ----------------------------------------------
	            MARKER INTERFACE – Emergency Detection
	           ---------------------------------------------- */
	        System.out.println("\n--- Emergency Services Priority ---");
	        services.forEach(s -> {
	            if (s instanceof EmergencyService) {
	                System.out.println(s.getServiceName() + " gets HIGH PRIORITY ");
	            }
	        });

	        System.out.println("\nSystem Running Successfully ");
	    }
	}
