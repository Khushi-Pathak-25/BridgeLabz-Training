package com.interfaces.marker.serialization;

import java.io.*;

public class BackupProcessor {
    // method to create backup by serializing object to file
    public static void createBackup(Object obj, String fileName) {
	if (!(obj instanceof Serializable)) {
	    System.out.println(
		    "Error: " + obj.getClass().getSimpleName() + " is not Serializable. Cannot create backup.");
	    return;
	}

	try (FileOutputStream fileOut = new FileOutputStream(fileName);
		ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

	    out.writeObject(obj);
	    System.out.println("Backup created successfully: " + fileName);

	} catch (IOException e) {
	    System.out.println("Backup failed: " + e.getMessage());
	}
    }

    // method to restore object from backup file
    public static Object restoreBackup(String fileName) {
	try (FileInputStream fileIn = new FileInputStream(fileName);
		ObjectInputStream in = new ObjectInputStream(fileIn)) {

	    Object obj = in.readObject();
	    System.out.println("Backup restored successfully from: " + fileName);
	    return obj;

	} catch (IOException | ClassNotFoundException e) {
	    System.out.println("Restore failed: " + e.getMessage());
	    return null;
	}
    }
}