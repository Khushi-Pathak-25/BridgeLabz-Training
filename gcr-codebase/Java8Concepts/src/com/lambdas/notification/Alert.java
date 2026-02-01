package com.lambdas.notification;

public class Alert {
    private String patientId;
    private String message;
    private String severity; //low, medium, high, critical
    private boolean isUrgent;

    // constructor
    public Alert(String patientId, String message, String severity, boolean isUrgent) {
	this.patientId = patientId;
	this.message = message;
	this.severity = severity;
	this.isUrgent = isUrgent;
    }

    // getters
    public String getPatientId() {
	return patientId;
    }

    public String getMessage() {
	return message;
    }

    public String getSeverity() {
	return severity;
    }

    public boolean isUrgent() {
	return isUrgent;
    }

    // good string representation
    @Override
    public String toString() {
	return "Alert[Patient=" + patientId + ", Severity=" + severity + ", Urgent=" + isUrgent + ", Msg=" + message
		+ "]";
    }
}