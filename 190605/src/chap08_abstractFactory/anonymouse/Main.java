package chap08_abstractFactory.anonymouse;

import chap08_abstractFactory.factory.*;

public class Main {

	public static void main(String[] args) {
		if(args.length != 1)	{
			System.out.println("Usage: java Main class.name.of.ConcreteFactory");
			System.out.println("Example 1: java Main listfactory.ListFactory");
			System.out.println("Example 2: java Main tablefactory.TableFactory");
			System.exit(0);
		}
		Factory factory = Factory.getFactory(args[0]);
		
		Link joins = factory.createLink("중앙일보", "http://www.joins.com");
		Link chosun = factory.createLink("조선일보", "http://www.chosun.com");
		
		Link ys_yahoo = factory.createLink("YaHoo!", "http://www.ys_yahoo.com");
		Link kr_yahoo = factory.createLink("YaHoo!Korea", "http://www.kr_yahoo.com");
		
		Link excite = factory.createLink("Excite", "http://www.excite.com");
		Link google = factory.createLink("Google", "http://www.google.com");
		
		Tray traynews = factory.createTray("신문");
		traynews.add(joins);
		traynews.add(chosun);
		
		Tray trayyahoo = factory.createTray("Yahoo!");
		trayyahoo.add(ys_yahoo);
		trayyahoo.add(kr_yahoo);
		
		Tray traysearch = factory.createTray("검색엔진");
		traysearch.add(trayyahoo);
		traysearch.add(excite);
		traysearch.add(google);
		
		Page page = factory.createPage("LinkPage", "예지닷컴");
		page.add(traynews);
		page.add(traysearch);
		page.output();

	}

}
