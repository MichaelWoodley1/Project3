package com.company;

import java.util.ArrayList;
import java.util.Random;

public class TeamManager {
	private ArrayList<Team> teams = new ArrayList<Team>();
	
	public void createTeams(ArrayList<Olympian> olympians) {
		
		while(olympians.size() > 0) {
			Team newTeam = new Team();
			Random rand = new Random();
			int max = olympians.size() - 1;
			int min = 0;
			// want to generate a random number less than the size of the olympians array
			int randIndex = rand.nextInt((max - min) + 1) + min;
			Olympian o1 = olympians.get(randIndex);
			olympians.remove(randIndex);
			
			// reset the max to the new size of the array
			max = olympians.size() - 1;
			randIndex = rand.nextInt((max - min) + 1) + min;
			Olympian o2 = olympians.get(randIndex);		
			olympians.remove(randIndex);
			
			// set the olympians
			newTeam.setOlympian1(o1);
			newTeam.setOlympian2(o2);
			this.teams.add(newTeam);
		}
	}
	
//	public TeamManager(ArrayList<Olympian> olympians) {
//		// Count the amount of males and females in the list
//		int males = 0;
//		int females = 0;
//		for(int i = 0 ; i < olympians.size(); i++) {
//			if(olympians.get(i).sex == Sex.MALE) {
//				males++;
//			} else {
//				females++;
//			}
//		}
//		
//		while(olympians.size() > 0) {
//			Team newTeam = new Team();
//			Random rand = new Random();
//			int max = olympians.size();
//			int min = 0;
//			// want to generate a random number less than the size of the olympians array
//			int randIndex = rand.nextInt((max - min) + 1) + min;
//			
//			// Get the olympian at the random index we just generated in the list
//			Olympian o1 = olympians.get(randIndex);
//			// remove from the olympian list
//			olympians.remove(randIndex);
//		
//			// Get another olympian at a random index
//			randIndex = rand.nextInt((max - min) + 1) + min;
//			// Assigns the random olympian to o2
//			Olympian o2 = olympians.get(randIndex);
//			if(o1.sex != o2.sex || (o1.sex == o2.sex && males != females)) {
//				newTeam.setOlympian1(o1);
//				newTeam.setOlympian2(o2);
//				// remove the second olymipan to avoid duplication
//				olympians.remove(randIndex);
//			} else {
//				// need a different olympian
//				int newRandIndex = rand.nextInt((max - min) + 1) + min;
//				while(newRandIndex == randIndex) {
//					newRandIndex = rand.nextInt((max - min) + 1) + min;
//				}
//				// get the new olympian
//				o2 = olympians.get(newRandIndex);
//				newTeam.setOlympian1(o1);
//				newTeam.setOlympian2(o2);
//				olympians.remove(newRandIndex);
//			}
//			
//			if(o1.sex == Sex.MALE) {
//				males--;
//			} else {
//				females--;
//			}
//			
//			if(o2.sex == Sex.MALE) {
//				males--;
//			} else {
//				females--;
//			}
//			
//			// Add the new team to the list of teams
//			this.teams.add(newTeam);
//		}
//	}
	
	public ArrayList<Team> getTeams() {
		return this.teams;
	}
	
	public static void main(String[] args) {
	}
}
