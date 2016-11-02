package com.qagroup.homework.oop;

public class FootballTeam extends Team {

	public FootballTeam() {
		super("FootballTeam",22);
	}
	@Override
	public void numberOfPlayers(int nubmers){
		System.out.println(getName() + " have more than 11 players.We have " + nubmers + " players" );
	}
	public void achive(){
		System.out.println(getName() + " Must win this tournament");
	}
	
}
