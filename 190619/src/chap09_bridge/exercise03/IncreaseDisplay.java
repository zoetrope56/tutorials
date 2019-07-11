package chap09_bridge.exercise03;

import chap09_bridge.*;

public class IncreaseDisplay extends CountDisplay{
	private int num;
	public IncreaseDisplay(DisplayImpl impl, int num) {
		super(impl);
		this.num = num;
	}
	
	public void IncreaseDisplay(int level)	{
		int count=0;
		for(int i=0; i<level; i++)	{
			multiDisplay(count);
			count+=num;			
		}		
	}

}
