package com.multithreading.printshop;

public class Printer {

	public static synchronized void print(String jobName, int pages, String priorityLevel) {

		for (int i = 1; i <= pages; i++) {
			System.out.println(priorityLevel + " Printing " + jobName + " - Page " + i + " of " + pages);

			try {
				Thread.sleep(100); // 100ms per page
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println(jobName + " completed.\n");
	}
}
