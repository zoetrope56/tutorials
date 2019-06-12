package chap02_adapter.exercise;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		FileIO f = new FileProperties();
		try	{
			f.readFromFile("file.txt");
			f.setValue("year", "2019");
			f.setValue("month", "6");
			f.setValue("day", "5");
			f.writeToFile("newfile.txt");
			
			
		}
		catch(IOException e)	{
			e.printStackTrace();
		}

	}

}
