package chap07_builder.exercise2;

public class TextBuilder extends Builder{
	private StringBuffer buffer = new StringBuffer();

	@Override
	public void buildTitle(String title) {
		buffer.append("========================================\n");
		buffer.append("["+title+"]");
		buffer.append("\n");
		
	}

	@Override
	public void buildString(String str) {
		buffer.append('бс'+str+"\n");
		buffer.append("\n");
		
	}

	@Override
	public void buildItems(String[] items) {
		for(int i=0; i<items.length; i++)	{
			buffer.append("в┴ "+items[i]+"\n");
		}
		buffer.append("\n");
		
	}

	@Override
	public void buildDone() {
		buffer.append("========================================\n");
	}
	
	public String getResult()	{
		return buffer.toString();
	}

}
