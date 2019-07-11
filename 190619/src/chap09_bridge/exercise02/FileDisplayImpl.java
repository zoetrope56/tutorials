package chap09_bridge.exercise02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import chap09_bridge.DisplayImpl;

public class FileDisplayImpl extends DisplayImpl{
	private String filename;
	private FileReader reader;
	
	public FileDisplayImpl(String filename)	{
		this.filename = filename;
		
	}

	@Override
	public void rawOpen() {
		// TODO Auto-generated method stub
		try {
			reader = new FileReader(filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("=========="+filename+"==========");
		
	}

	@Override
	public void rawPrint() {
		int cur = 0;
		try {
			while((cur = reader.read()) != -1)	{
				System.out.print((char)cur);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
	}

	@Override
	public void rawClose() {
		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("============================");
		
	}

}
