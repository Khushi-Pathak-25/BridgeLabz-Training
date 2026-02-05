package com.multithreading.downloadmanager;

public class DownloadManagerRunnableApproach {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new FileDownloaderRunnable("Document.pdf"), "Thread-1");
		Thread t2 = new Thread(new FileDownloaderRunnable("Image.jpg"), "Thread-2");
		Thread t3 = new Thread(new FileDownloaderRunnable("Video.mp4"), "Thread-3");

		t1.start();
		t2.start();
		t3.start();

		// Main thread waits
		t1.join();
		t2.join();
		t3.join();

		System.out.println("All downloads complete!");
	}
}
