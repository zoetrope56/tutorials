package chap09_bridge.exercise01;

import java.util.Random;
import chap09_bridge.Display;
import chap09_bridge.DisplayImpl;

public class RandomDisplay extends Display{
	// Exercise1 solution
	private Random random = new Random();
		
	public RandomDisplay(DisplayImpl impl) {
		super(impl);

	}	
	
	public void randomDisplay(int times)	{
		random.setSeed(System.currentTimeMillis());
		int num = random.nextInt(times);
		System.out.println("random count : "+num);
		
		open();
		for(int i=0; i<num; i++)
			print();
		close();			
		
	}

}
