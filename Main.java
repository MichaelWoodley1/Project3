    package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	static String[][] olympians;
    static OlympianManager olympianManager = new OlympianManager();
    static EventManager eventManager = new EventManager();
    static TeamManager teamManager = new TeamManager();

    public static void main(String[] args) {
    	
        //createOlympians();
        
        //Display Application Name
        System.out.println("Lawn Game Olympics");
        
        // Read user input using a Buffered Reader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
        	// Ask user to give a path to the LGOO file
        	System.out.println("Give a path to a LGOO file.");
        	String path = reader.readLine().trim();
        	readFile(path);
        	System.out.println("Enter a command: ");
        	String command = reader.readLine().trim().toLowerCase();
        	// Interactive application loop
        	while(true) {
        		if(command.equals("events") || command.equals("e")) {
        			listEvents();
        		} else if(command.equals("olympians") || command.equals("o")) {
        			listOlympians();
        		} else if(command.equals("help") || command.equals("h")) {
        			listHelp();
        		} else if(command.equals("teams") || command.equals("t")) {
        			listTeams();
        		} else if(command.equals("quit") || command.equals("q")) {
        			System.out.println("Exiting the program.");
        			break;
        		}
        		System.out.println();
        		System.out.println("Enter a command: ");
        		command = reader.readLine();
        	}
        } catch(IOException e) {
        	System.out.println("Failed to run the application loop.");
        }

    }//end main method

    //Display the list of Olympians for the day
    public static void listEvents() {
    	for(int i = 0; i < eventManager.events.length; i++) {
    		Event event = eventManager.events[i];
    		String printStr = "Event Name: " + event.name + " Play To: " + event.playTo + " is Play to exact: " + event.isPlayToExact
    				+ " Play Distance: " + event.playDistance + " Extra Info: " + event.getExtraInfo();
    		System.out.println(printStr);
    	}
    }//end method

    //How to display the olympians in the array
    public static void listOlympians() {    	
    	for (int i = 0; i < olympianManager.olympians.size(); i++) {
    		System.out.println(olympianManager.olympians.get(i));
    	}
    }//end method

    //Display the list of Help options
    public static void listHelp() {
        System.out.println("events or e : list the day's events");
        System.out.println("olympians or e : list the day's olympians");
        System.out.println("help or h : display the acceptable commands as well as a description of what each command does ");

    }//end method

    // Read the LGOO file and load olympians into the Olympian Manager list
    public static void readFile(String path) {
    	try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			String line = reader.readLine();
			// Check if the first line of the file is LGOO
			if(line.equals("LGOO")) {
				line = reader.readLine();
				while(line != null) {
					// Split the string of the next line into 3 String objects
					String[] ls = line.split(", ");
					String name = ls[0];
					String sex = ls[1];
					Sex tempSex;
					// Convert String sex to Enum sex
					if(sex.equals("M")) {
						tempSex = Sex.MALE;
					} else {
						tempSex = Sex.FEMALE;
					}
					// Convert String age to int age
					String age = ls[2];
					int tempAge = Integer.parseInt(age);
					// Create a temp olympian object
					Olympian tempOlympian = new Olympian(name, tempSex, tempAge);
					// Add it to the array list
					olympianManager.olympians.add(tempOlympian);
					// Read next line
					line = reader.readLine();
				}
			} else {
				System.out.println("Invalid File.");
			}
			
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not Found.");
		} catch (IOException e) {
			System.out.println("Something wrong with the file.");
		}
    }
    
    // Lists all the teams in the console
    public static void listTeams() {
    	teamManager.createTeams(olympianManager.olympians);
    	ArrayList<Team> teams = teamManager.getTeams();
    	for(int i = 0; i < teams.size(); i++) {
    		System.out.println("Team " + i);
    		System.out.println(teams.get(i));
    	}
    }
}
