package com.company;


public class CornHoleEvent extends Event {
    public int numBeanBags;

    public String getExtraInfo() {return "Number of beans bags  is " + this.numBeanBags;}
}
