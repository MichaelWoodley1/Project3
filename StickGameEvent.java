package com.company;


public class StickGameEvent extends Event{
    public int frisbeeSize;

    @Override
    public String getExtraInfo() {
        return "Frisbee size is " + this.frisbeeSize;
    }
}
