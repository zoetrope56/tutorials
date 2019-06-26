package chap07_builder;

import chap07_builder.exercise3.FileBuilder;

public class Main {

	public static void main(String[] args) {
		if(args.length != 1)	{
			usage();
			System.exit(0);
		}
		
		if(args[0].equals("plain"))	{
			TextBuilder textbuilder = new TextBuilder();
			Director director = new Director(textbuilder);
			director.construct();
			
			String result = textbuilder.getResult();
			System.out.println(result);
		} 		
		else if(args[0].equals("html"))	{
			HTMLBuilder htmlbuilder = new HTMLBuilder();
			Director director = new Director(htmlbuilder);
			director.construct();
			
			String filename = htmlbuilder.getResult();
			System.out.println(filename + "�� �ۼ��Ǿ����ϴ�.");
		}
		else if(args[0].equals("text"))	{
			// exercise3 solution
			FileBuilder filebuilder = new FileBuilder();
			Director director = new Director(filebuilder);
			director.construct();
			
			String filename = filebuilder.getResult();
			System.out.println(filename + "�� �ۼ��Ǿ����ϴ�.");			
		}
		else	{
			usage();
			System.exit(0);
		}
		

	}

	private static void usage() {
		System.out.println("Usage : java Main plain	�Ϲ� �ؽ�Ʈ�� ���� �ۼ�");
		System.out.println("Usage : java Main html	HTML ���Ϸ� ���� �ۼ�");
		System.out.println("Usage : java Main text	text ���Ϸ� ���� �ۼ�");
		
	}

}
