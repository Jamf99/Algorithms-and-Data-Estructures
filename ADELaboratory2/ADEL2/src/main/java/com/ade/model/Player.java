package com.ade.model;

import com.ade.estructures.Stack;

public class Player {
	
	public static final int NOPLATAFORM = 0;
	public static final int PLAYSTATION = 1;
	public static final int XBOX = 2;
	public static final int NINTENDO_SWITCH = 3;
	public static final int SMARTPHONE = 4;
	public static final int PC = 5;
	
	private Player next;
	private Stack<Weapon> weapons;
	
	private String name;
	private double deaths;
	private double kills;
	private double averagePing;
	private int plataform;
	private int victories;
	private int gamesPlayed;
	
	public Player(String name, double deaths, double kills, int victories, int gamesPlayed, double averagePing, int plataform) {
		super();
		this.name = name;
		this.deaths = deaths;
		this.kills = kills;
		this.victories = victories;
		this.gamesPlayed = gamesPlayed;
		this.averagePing = averagePing;
		this.plataform = plataform;
		this.next = null;
		weapons = new Stack<Weapon>();
	}
	
	public Stack<Weapon> getWeapons() {
		return weapons;
	}

	public void shoot() {
		if(weapons.getTop().getAmmo() > 0) {
			weapons.getTop().setAmmo(weapons.getTop().getAmmo()-1);
		}else {
			weapons.pop();
		}
		
	}
	
	public void pickWeapon(Weapon weapon) {
		weapons.push(weapon);
	}
	
	public double calculateGameProwess() {
		double winProbability = victories/gamesPlayed;
		double gameProwess = winProbability*kills;
		return gameProwess;
	}
	
	public Player getNext() {
		return next;
	}
	
	public void setNext(Player next) {
		this.next = next;	
	}
	
	public void disconectNext() {
		this.next = next.next;
	}

	public String getName() {
		return name;
	}
	
	public double getDeaths() {
		return deaths;
	}
	
	public double getKills() {
		return kills;
	}

	public double getAveragePing() {
		return averagePing;
	}

	public int getPlataform() {
		return plataform;
	}

	public int getVictories() {
		return victories;
	}

	public int getGamesPlayed() {
		return gamesPlayed;
	}
	
}
