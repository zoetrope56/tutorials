package chap09_bridge.exercise03;

public class Main {

	public static void main(String[] args) {
		IncreaseDisplay d = new IncreaseDisplay(new CharDisplayImpl("<", "*", ">"), 2);
		d.IncreaseDisplay(7);

	}

}
