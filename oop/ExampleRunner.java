package com.qagroup.homework.oop;
		
public class ExampleRunner {
	
	public static void main(String[] args) {

		FootballTeam foot = new FootballTeam();
		Team football = new FootballTeam();
		Team tenis = new TenisTeam();
		Team hockey = new HockeyTeam();
		
		
		football.name();
		football.numberOfPlayers(22);
		football.instrument("Ball");
		football.age();
		System.out.println();
		tenis.name();
		tenis.numberOfPlayers(2);
		tenis.instrument("Rockets");
		System.out.println();
		hockey.name();
		hockey.numberOfPlayers(6);
		hockey.instrument("Hockey puck");
		System.out.println();
		foot.achive();
		
	}

}
