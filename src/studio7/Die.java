package studio7;

public class Die {
	
	private int sideNum;
	
	public Die(int sideNum)
	{
		this.sideNum=sideNum;
	}
	/**
	 * throws the die randomly
	 * @return a random integer k in [1,n], k is integer.
	 */
	public int throwDie()
	{
		return (int) (Math.random()*sideNum+1);
	}
	
	public void setSides(int sideNum)
	{
		this.sideNum=sideNum;
	}
	
	public int getSides()
	{
		return sideNum;
	}
}
