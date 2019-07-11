package chap09_bridge.exercise02;

import chap09_bridge.Display;

public class Main {

	public static void main(String[] args) {
		Display d = new Display(new FileDisplayImpl("test.txt"));
		d.display();

	}

}
