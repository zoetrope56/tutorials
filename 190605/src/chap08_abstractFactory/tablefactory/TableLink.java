package chap08_abstractFactory.tablefactory;

import chap08_abstractFactory.factory.*;

public class TableLink extends Link{
	public TableLink(String caption, String url)	{
		super(caption, url);
	}

	@Override
	public String makeHTML() {
		return "<td><a href=\" "+url+"\">"+caption+"</a><td>\n";
	}

}
