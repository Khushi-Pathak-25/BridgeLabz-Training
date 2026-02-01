package com.interfaces.marker.sensitivedata;

public class SensitiveDataProcessor {

    // method that checks for Sensitive marker and "encrypts"
    public static void processAndEncrypt(Object data) {
        if (data instanceof Sensitive) {
            System.out.println("Sensitive data detected -> Applying encryption...");
            System.out.println("Original: " + data);
            System.out.println("Encrypted (simulated): [ENCRYPTED_AES_256] " + data.getClass().getSimpleName());
            System.out.println("Data safely stored/transmitted.");
        } else {
            System.out.println("Data is not marked as Sensitive → No encryption needed.");
            System.out.println("Processed: " + data);
        }
    }
}