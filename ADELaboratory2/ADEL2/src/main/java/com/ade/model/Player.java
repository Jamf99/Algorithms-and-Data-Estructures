package com.ade.model;

public class Player {
	
	public static final int PLAYSTATION = 1;
	public static final int XBOX = 2;
	public static final int NINTENDO_SWITCH = 3;
	public static final int SMARTPHONE = 4;
	public static final int HIGH = 1;
	public static final int MEDIUM = 2;
	public static final int LOW = 3;
	
	private Player next;
	
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
	}
	
	public int calculateGameProwess() {
		int gameProwess = 0;
		double winProbability = victories/gamesPlayed;
		double rating = winProbability*kills;
		if(rating <= 40 && rating >=0) {
			gameProwess = Player.LOW;
		}else if(rating > 40 && rating <= 90){
			gameProwess = Player.MEDIUM;
		}else if(rating > 90) {
			gameProwess = Player.HIGH;
		}
		return gameProwess;
	}
	
	public int calculatePingRange() {
		int ping = 0;
		if(averagePing<= 150 && averagePing >=0) {
			ping = Player.LOW;
		}else if(averagePing > 150 && averagePing <= 400){
			ping = Player.MEDIUM;
		}else if(averagePing > 400) {
			ping = Player.HIGH;
		}
		return ping;
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
