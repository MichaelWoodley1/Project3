package com.company;

public class Olympian {
    public String name;
    public int age;
    public Sex sex;
    
    // Constructor
    public Olympian(String name, Sex sex, int age) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    
    public String toString() {
    	return this.name + " " + this.age + " " + this.sex;
    }
}
