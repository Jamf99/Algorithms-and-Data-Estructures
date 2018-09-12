package com.ade.model;

import com.ade.estructures.LinkedList;
import com.ade.estructures.Queue;

public class Plataform {
	
	private LinkedList<Player> players;
	private Queue<Player> queueOfPlayers1, queueOfPlayers2, queueOfPlayers3, queueOfPlayers4, queueOfPlayers5, queueOfPlayers6, 
							queueOfPlayers7, queueOfPlayers8, queueOfPlayers9;
	
	private String name;
		
	public Plataform(String name) {
		this.name = name;
		players = new LinkedList<Player>();
		queueOfPlayers1 = new Queue<Player>();queueOfPlayers2 = new Queue<Player>();queueOfPlayers3 = new Queue<Player>();
		queueOfPlayers4 = new Queue<Player>();queueOfPlayers5 = new Queue<Player>();queueOfPlayers6 = new Queue<Player>();
		queueOfPlayers7 = new Queue<Player>();queueOfPlayers8 = new Queue<Player>();queueOfPlayers9 = new Queue<Player>();
	}
	
	public String getName() {
		return name;
	}
	
	public LinkedList<Player> getPlayers(){
		return players;
	}
	
	public void clasifyByGameProwess() {
		Player aux = players.getFirstElement().getElement();
		while(aux!=null) {
			if(aux.calculateGameProwess() >= 0 && aux.calculateGameProwess() <= 40) {
				if(aux.getAveragePing() >= 0 && aux.getAveragePing() <=150) {
					queueOfPlayers1.enqueue(aux);
				}else if(aux.getAveragePing() > 150 && aux.getAveragePing() <= 400) {
					queueOfPlayers2.enqueue(aux);
				}else {
					queueOfPlayers3.enqueue(aux);
				}
			}else if(aux.calculateGameProwess() > 40 && aux.calculateGameProwess() <= 90) {
				if(aux.getAveragePing() >= 0 && aux.getAveragePing() <=150) {
					queueOfPlayers4.enqueue(aux);
				}else if(aux.getAveragePing() > 150 && aux.getAveragePing() <= 400) {
					queueOfPlayers5.enqueue(aux);
				}else {
					queueOfPlayers6.enqueue(aux);
				}
			}else {
				if(aux.getAveragePing() >= 0 && aux.getAveragePing() <=150) {
					queueOfPlayers7.enqueue(aux);
				}else if(aux.getAveragePing() > 150 && aux.getAveragePing() <= 400) {
					queueOfPlayers8.enqueue(aux);
				}else {
					queueOfPlayers9.enqueue(aux);
				}
			}
			aux = aux.getNext();
		}
	}
	
	public Queue<Player> getQueueOfPlayers1(){
		return queueOfPlayers1;
	}

	public Queue<Player> getQueueOfPlayers2() {
		return queueOfPlayers2;
	}

	public Queue<Player> getQueueOfPlayers3() {
		return queueOfPlayers3;
	}

	public Queue<Player> getQueueOfPlayers4() {
		return queueOfPlayers4;
	}

	public Queue<Player> getQueueOfPlayers5() {
		return queueOfPlayers5;
	}

	public Queue<Player> getQueueOfPlayers6() {
		return queueOfPlayers6;
	}

	public Queue<Player> getQueueOfPlayers7() {
		return queueOfPlayers7;
	}

	public Queue<Player> getQueueOfPlayers8() {
		return queueOfPlayers8;
	}

	public Queue<Player> getQueueOfPlayers9() {
		return queueOfPlayers9;
	}

}