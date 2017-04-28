package fileReading;

import java.io.IOException;

public class Main {
	
	public static void main(String [] args){
		try {
			ReadingFromFile.bufferedCopy( "C:\\users\\administrator\\Documents\\NewText.txt" , "C:\\users\\administrator\\Documents\\TextCopy.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("---------------");
		System.out.println("Done");
	}
}
