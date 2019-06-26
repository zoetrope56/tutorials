package chap07_builder.exercise3;

import java.io.FileWriter;
import java.io.IOException;

import chap07_builder.Builder;

public class FileBuilder extends Builder{
	private String filename;
	private FileWriter writer;
	
	@Override
	public void makeTitle(String title) {
		filename = title+".txt";
		
		try {
			writer = new FileWriter(filename);
			writer.write("========================================\n");
			writer.write("["+ title +"]");
			writer.write("\n");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void makeString(String str) {
		try {
			writer.write('бс'+str+"\n");
			writer.write("\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void makeItems(String[] items) {
		try {
			for(int i=0; i<items.length; i++)
				writer.write("в┴ "+items[i]+"\n");
			writer.write("\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void close() {
		try {
			writer.write("========================================\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public String getResult()	{
		return filename;
	}

}
