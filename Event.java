package com.company;


// create subclasses of event
// create a new class file for each new event
// each class file extends from event

public abstract class Event {

    public String name;
    public int playTo;
    public boolean isPlayToExact;
    public int playDistance;

    public abstract String getExtraInfo();
}
