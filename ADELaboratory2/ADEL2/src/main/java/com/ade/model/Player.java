package com.ade.model;

public class Player {
	
	private Player next;
	
	private String name;
	private double averageDeaths;
	private double averageKills;
	private int victorys;
	private double averagePing;
	
	public Player(String name, double averageDeaths, double averageKills, int victorys, double averagePing) {
		super();
		this.name = name;
		this.averageDeaths = averageDeaths;
		this.averageKills = averageKills;
		this.victorys = victorys;
		this.averagePing = averagePing;
		this.next = null;
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
	
	public double getAverageDeaths() {
		return averageDeaths;
	}
	
	public double getAverageKills() {
		return averageKills;
	}
	
	public int getVictorys() {
		return victorys;
	}
	
	public double getAveragePing() {
		return averagePing;
	}

	

}
