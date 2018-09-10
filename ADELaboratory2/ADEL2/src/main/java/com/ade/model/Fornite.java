package com.ade.model;

public class Fornite {
	
	private Plataform[] plataforms;
	private Player firstPlayer;
	private int playersSize;
	
	public Fornite() {
		plataforms = new Plataform[4];
		plataforms[0] = new Plataform("PlayStation");
		plataforms[1] = new Plataform("Xbox");
		plataforms[2] = new Plataform("Nintendo Switch");
		plataforms[3] = new Plataform("Smartphone");
	}
	
	public Fornite(int x) {
		firstPlayer = null;
		playersSize = 0;
	}
	
	public Player getFirstPlayer() {
		return firstPlayer;
	}
	
	public int getPlayersSize() {
		return playersSize;
	}
	
	public Plataform[] getPlataforms() {
		return plataforms;
	}
	
	public boolean isEmpty() {
		if(playersSize == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void matchPlayersWithoutPlataformMode() {
		
	}
	
	public void add(Player player) {
		Player p = new Player(player.getName(), player.getDeaths(), player.getKills(), player.getVictories(), player.getGamesPlayed(),
				player.getAveragePing(), player.getPlataform());
		if (isEmpty()) {
			firstPlayer = p;
		} else {
			Player aux = firstPlayer;
			while (aux.getNext() != null) {
				aux = aux.getNext();
			}

			aux.setNext(p);
		}
		playersSize++;
	}

}
