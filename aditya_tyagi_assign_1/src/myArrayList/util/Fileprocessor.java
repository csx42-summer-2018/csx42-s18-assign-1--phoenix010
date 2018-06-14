package myArrayList.util;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Fileprocessor {
	public static String readLine(String file) throws IOException, FileNotFoundException  {

		//Refernece "https://stackoverflow.com/questions/326390/how-do-i-create-a-java-string-from-the-contents-of-a-file"

		String content = new String(Files.readAllBytes(Paths.get("file")));
		return content;
	}
}