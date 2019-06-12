package chap08_abstractFactory.listfactory;

import chap08_abstractFactory.factory.*;

public class ListFactory extends Factory{

	@Override
	public Link createLink(String caption, String url) {
		return new ListLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		return null;
	}

	@Override
	public Page createPage(String title, String author) {
		return null;
	}

}
