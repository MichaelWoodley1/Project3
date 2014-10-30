package com.company;

public class Team {
	private Olympian olympian1;
	private Olympian olympian2;
	private int wins;
	private int losses;
	
	public void setOlympian1(Olympian o) {
		this.olympian1 = o;
	}
	
	public Olympian getOlympian1() {
		return this.olympian1;
	}
	
	public void setOlympian2(Olympian o) {
		this.olympian2 = o;
	}
	
	public Olympian getOlympian2() {
		return this.olympian2;
	}
	
	public void setWins(int wins) {
		this.wins = wins;
	}
	
	public int getWins() {
		return this.wins;
	}
	
	public void setLosses(int losses) {
		this.losses = losses;
	}
	
	public int getLosses() {
		return this.losses;
	}
	
	public String toString() {
		return "Olympian 1: " + this.olympian1 + " Olympian 2: " + this.olympian2;
	}
}
