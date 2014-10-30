package com.company;

public class LadderBallEvent extends Event {
    public int numRungs;

    @Override
    public String getExtraInfo() {
        return "Number of rungs " + this.numRungs;
    }
}
