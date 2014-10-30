package com.company;


public class CanJamEvent extends Event{
    public int frisbeeSize;
    
    public String getExtraInfo() {
        return "Frisbee size is " + this.frisbeeSize;
    }
}
