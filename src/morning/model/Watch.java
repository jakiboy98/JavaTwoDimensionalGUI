package morning.model;

public class Watch
{
	private int numberOfHands;
	private Color watchColor;
	
	public Watch()
	{
		this.numberOfHands = 1;
		this.watchColor = Color.GREY;
	}
	
	public Watch(int numberOfHands, Color watchColor)
	{
		
	}
	
	public int getNumberOfHands()
	{
		
	}
	
	public Color getWatchColor()
	{
		
	}
	
	public void setNumberOfHands(int numberOfHands)
	{
		
	}
	
	public void setWatchColor(Color watchColor)
	{
		
	}
	
	public String toString()
	{
		String watchDescription = "This watch has " + numberOfHands + " hands, and its color is " + watchColor;
		
		return watchDescription;
	}
}
