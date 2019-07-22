package chap09_bridge.exercise01;

import chap09_bridge.StringDisplayImpl;

public class Main {
	public static void main(String[] args) {
		// Exercise 01
		RandomDisplay d4 = new RandomDisplay(new StringDisplayImpl("Hello, Zoetrope"));
		d4.randomDisplay(10);

	}

}
