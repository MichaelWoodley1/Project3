package com.company;


public class HorseShoesEvent extends Event {
    public int numHorseShoes;

    @Override
    public String getExtraInfo() { return "Number of horse shoes is " + this.numHorseShoes;

    }
}
