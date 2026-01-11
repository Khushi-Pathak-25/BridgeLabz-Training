package com.analysis.fileread;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderProcessor {

	public static int countCharacters(String filePath) throws IOException {
		int count = 0;

		try (InputStreamReader reader = new InputStreamReader(new FileInputStream(filePath))) {

			char[] buffer = new char[8192];
			int charsRead;

			while ((charsRead = reader.read(buffer)) != -1) {
				count += charsRead;
			}
		}
		return count;
	}
}