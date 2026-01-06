package com.dayfour.eventmanagementplatform;

public interface ISchedulable {
	
	void schedule();
    void reschedule(String newDate);
    void cancel();

}
