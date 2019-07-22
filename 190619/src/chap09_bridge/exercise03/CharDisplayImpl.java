package chap09_bridge.exercise03;

import chap09_bridge.*;

public class CharDisplayImpl extends DisplayImpl{
	private String str1;
	private String str2;
	private String str3;

	public CharDisplayImpl(String str1, String str2, String str3) {
		this.str1 = str1;
		this.str2 = str2;
		this.str3 = str3;
	}

	@Override
	public void rawOpen() {
		System.out.print(str1);
		
	}

	@Override
	public void rawPrint() {
		System.out.print(str2);
		
	}

	@Override
	public void rawClose() {
		System.out.println(str3);
		
	}

}
