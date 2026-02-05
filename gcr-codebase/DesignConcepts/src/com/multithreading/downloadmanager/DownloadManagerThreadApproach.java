package com.multithreading.downloadmanager;

public class DownloadManagerThreadApproach {

	public static void main(String[] args) throws InterruptedException {

		FileDownloaderThread t1 = new FileDownloaderThread("Document.pdf");
		FileDownloaderThread t2 = new FileDownloaderThread("Image.jpg");
		FileDownloaderThread t3 = new FileDownloaderThread("Video.mp4");

		t1.start();
		t2.start();
		t3.start();

		// Main thread waits for all downloads

		t1.join();
		t2.join();
		t3.join();

		System.out.println("All downloads complete!");
	}
}
