package chap10_strategy;

public interface Strategy {
	public abstract Hand nextHand();
	public abstract void Study(boolean win);

}
