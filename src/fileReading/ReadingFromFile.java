package fileReading;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ReadingFromFile {
	
	public static void bufferedCopy(String inFile, String outFile ) throws IOException{
		
		ArrayList <String> text = new ArrayList <String>();
		BufferedReader bfrIn = new BufferedReader (new FileReader(inFile));
		BufferedWriter bfwOut = new BufferedWriter (new FileWriter(outFile));
		String line = " ";
		while (((line = bfrIn.readLine()) != null)){
			text.add(line);
			System.out.println(line + "\n");
			bfwOut.write(line + "\n ");
		}
		System.out.println("---------------");
		
		bfrIn.close();
		bfwOut.close();
		
		
		//ProcessBuilder pb = new ProcessBuilder("notepad.exe", "C:\\users\\administrator\\Documents\\TextCopy.txt");
		//pb.start();
					
		for (int i = 0; i< text.size(); i++){
			
			char[] charArray = text.get(i).toCharArray();
			Arrays.sort(charArray);
			String sortedString = new String(charArray);
			System.out.println(sortedString); 
			}
		}

}
