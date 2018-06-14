package myArrayList.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
/**
 * 
 * @author aditya
 *
 */

public class Fileprocessor {
	
/**Method reads the input file from the user. and returns the string file back to the calling method
 * 
 * @param input.txt
 * @return
 * @throws IOException
 * @throws FileNotFoundException
 */
	public static String readLine(String file) throws IOException, FileNotFoundException {

		String content = new String(Files.readAllBytes(Paths.get("input.txt")));
		return content;
	}
}