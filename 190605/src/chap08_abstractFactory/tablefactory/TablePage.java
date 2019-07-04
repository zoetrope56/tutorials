package chap08_abstractFactory.tablefactory;

import chap08_abstractFactory.factory.*;

public class TablePage extends Page {

	public TablePage(String title, String author) {
		super(title, author);
	}

	@Override
	public String makeHTML() {
		return null;
	}

}
