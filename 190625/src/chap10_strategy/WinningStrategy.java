package chap10_strategy;

import java.util.Random;

public class WinningStrategy implements Strategy {
	private Random random;
	private boolean won = false;
	private Hand prevHand;
	
	public WinningStrategy(int seed)	{
		random = new Random(seed);		
	}

	@Override
	public Hand nextHand() {
		if(!won)
			prevHand = Hand.getHand(random.nextInt());
		return null;
	}

	@Override
	public void Study(boolean win) {
		won = win;		
	}

}
