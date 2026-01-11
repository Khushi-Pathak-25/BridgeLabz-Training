package com.analysis.fileread;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderProcessor {

	public static int countCharacters(String filePath) throws IOException {
		int count = 0;

		try (FileReader reader = new FileReader(filePath)) {
			while (reader.read() != -1) {
				count++;
			}
		}
		return count;
	}
}