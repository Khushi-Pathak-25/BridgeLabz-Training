package com.interfaces.marker.sensitivedata;

public class Customer implements Sensitive {
    private String customerId;
    private String name;
    private String phoneNumber; // sensitive
    private String email; // sensitive
    private String aadhaarNumber; // very sensitive

    // constructor
    public Customer(String customerId, String name, String phoneNumber, String email, String aadhaarNumber) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.aadhaarNumber = aadhaarNumber;
    }

    // good string representation (mask sensitive fields)
    @Override
    public String toString() {
        return "Customer[ID=" + customerId + ", Name=" + name +
                ", Phone=XXXX-XXXX-" + phoneNumber.substring(8) +
                ", Email=" + maskEmail(email) +
                ", Aadhaar=XXXX-XXXX-" + aadhaarNumber.substring(8) + "]";
    }

    private String maskEmail(String email) {
        if (email == null || email.length() < 5) {            
            return "XXXX";
        }
        int atIndex = email.indexOf('@');
        return email.substring(0, 2) + "****" + email.substring(atIndex);
    }
}