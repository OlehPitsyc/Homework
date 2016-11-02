package com.qagroup.homework.oop;

public class HockeyTeam extends Team {

	public HockeyTeam() {
		super ("HockeyTeam",25);
	}
@Override
public void instrument(String instrument){
	System.out.println("Our " + getName() + " Have " + instrument );
}
}
