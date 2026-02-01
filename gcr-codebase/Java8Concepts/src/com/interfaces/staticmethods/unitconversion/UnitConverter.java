package com.interfaces.staticmethods.unitconversion;

public interface UnitConverter {

    // Conversion: kilometers to miles (1 km = 0.621371 miles)
    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    // Conversion: miles to kilometers (1 mile = 1.60934 km)
    static double milesToKm(double miles) {
        return miles * 1.60934;
    }

    // Conversion: kilograms to pounds (1 kg = 2.20462 lbs)
    static double kgToLbs(double kg) {
        return kg * 2.20462;
    }

    // Conversion: pounds to kilograms (1 lb = 0.453592 kg)
    static double lbsToKg(double lbs) {
        return lbs * 0.453592;
    }

    // helper format result with 2 decimal places
    static String formatResult(double value) {
        return String.format("%.2f", value);
    }
}