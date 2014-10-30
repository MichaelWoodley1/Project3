package com.company;


public class WashoosEvent extends Event{
	public boolean hasAutoWinStick;
	public int numWashoos;
	
	public String getExtraInfo() {
		return "It has auto win stick " + this.hasAutoWinStick + ". Number of Washoos" + this.numWashoos;
	}

}
