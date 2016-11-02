package com.qagroup.homework.oop;

public class Team {
	
	private String name;
	private int age;
	protected Team (String name, int age){
		this.name = name;
		this.age = age;
	}
	public void name(){
		System.out.println( "We are a " + this.name);
	}
	public void numberOfPlayers(int numbers){
		System.out.println(this.name + " have " + numbers + " players");
	
	}
	public void instrument(String instrument){
		System.out.println("Our " + this.name + " have " + instrument);
	}
	public void age(){
		System.out.println("Middle age of " + this.name + " " + this.age);
	}
	
	public String getName(){
	return this.name;
}
}
	
