package readingFromFileAndEdit;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class readingFromADoc {
	
public static String readFile(String inFile) throws IOException{
		
		String text = new String ();
		BufferedReader bfrIn = new BufferedReader (new FileReader(inFile));
		String line = " ";
		while (((line = bfrIn.readLine()) != null)){
			text += line + "\n";
		}
		bfrIn.close();
		return text;
		}
	}

