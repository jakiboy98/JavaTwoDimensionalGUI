package morning.controller;

import morning.model.Watch;
import morning.view.TwoDFrame;

public class TwoDController
{
	private TwoDFrame baseFrame;
	private Watch [][] myWatches;
	
	public TwoDController()
	{
		myWatches = new Watch[3][3];
		setupArray();
		baseFrame = new TwoDFrame(this);
	}
	
	public void start()
	{
		
	}
	
	private void setupArray()
	{
		for(int row = 0; row < myWatches.length; row++)
		{
			for(int col = 0; col < myWatches[0].length; col++)
			{
				myWatches[row][col] = new Watch();
				if(col % 2 == 0)
				{
					myWatches[row][col].setNumberOfHands(col + 5);
				}
				else
				{
					myWatches[row][col].setWatchColor(Color.GREY);
				}
			}
		}

	}
	
	public Watch [][] getMyWatches()
	{
		return myWatches;
	}
}
