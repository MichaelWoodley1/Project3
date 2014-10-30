package com.company;

public class EventManager {
	public Event[] events;
	
	// constructor
	public EventManager() {
		// initialize the events array to size 6
		this.events = new Event[6];
		
		// creating events
		CanJamEvent canJamEvent = new CanJamEvent();
		WashoosEvent washoosEvent = new WashoosEvent();
        CornHoleEvent cornHoleEvent = new CornHoleEvent();
        HorseShoesEvent horseShoesEvent = new HorseShoesEvent();
        LadderBallEvent ladderBallEvent = new LadderBallEvent();
        StickGameEvent stickGameEvent = new StickGameEvent();
		
		// adding events to the array
		this.events[0] = canJamEvent;
        this.events[1] = washoosEvent;
        this.events[2] = cornHoleEvent;
        this.events[3] = horseShoesEvent;
        this.events[4] = ladderBallEvent;
        this.events[5] = stickGameEvent;
	}
	
	public Event[] getEvents() {
		return this.events;
	}
}
