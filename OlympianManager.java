package com.company;

import java.util.ArrayList;

public class OlympianManager {
    public ArrayList<Olympian> olympians;
    
    // Constructor
    public OlympianManager() {
        olympians = new ArrayList<Olympian>();
        //this.olympians = new Olympian[16];
//        for(int i = 0; i < this.olympians.length; i++) {
//        	// create a new olympian object
//        	Sex tempSex = this.getSex(Main.olympians[i][1]);
//        	Olympian temp = new Olympian(Main.olympians[i][0], tempSex, Integer.parseInt(Main.olympians[i][2]));
//        	
//        	// add the new object into the array
//        	this.olympians[i] = temp;
//        }
        // TODO: Add all the olympians
        //this.olympians[0] = new Olympian("Mike", Sex.MALE, 20);
    }
    
    public ArrayList<Olympian> getOlympians() {
    	return this.olympians;
    }
    
    // Convert String into Enum
    public Sex getSex(String gender) {
    	if(gender == "M") {
    		return Sex.MALE;
    	} else {
    		return Sex.FEMALE;
    	}
    }
}


