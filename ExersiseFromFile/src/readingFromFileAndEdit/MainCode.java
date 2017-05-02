package readingFromFileAndEdit;

import java.io.IOException;


public class MainCode {

	public static void main(String [] args){
		try {
			readingFromADoc.readFile("C:\\users\\administrator\\Documents\\ExData.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			SplitingString.Split(readingFromADoc.readFile("C:\\users\\administrator\\Documents\\ExData.txt") , 1);
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
