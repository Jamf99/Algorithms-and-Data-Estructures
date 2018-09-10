package com.ade.model;

public class Plataform {
	
	private Player first;
	
	private String name;
	private int size;
	
	public Plataform(String name) {
		this.name = name;
		size = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public Player getFirst() {
		return first;
	}
	
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void add(Player player) {
		Player p = new Player(player.getName(), player.getAverageDeaths(), player.getAverageKills(), player.getVictorys(), player.getAveragePing());
		if (isEmpty()) {
			first = p;
		} else {
			Player aux = first;

			while (aux.getNext() != null) {
				aux = aux.getNext();
			}

			aux.setNext(p);
		}
		size++;
	}
	
//	public void remove(Player v) {
//		if (inicio.getValor() == v) {
//			inicio = (Nodo<V>) inicio.getSiguiente();
//
//		} else {
//			Nodo<V> aux = (Nodo<V>) inicio.getSiguiente();
//			Nodo<V> aux2 = (Nodo<V>) inicio;
//
//			while (aux.getSiguiente() != null) {
//				if (aux.getValor() == v) {
//					aux2.setSiguiente(aux.getSiguiente());
//				}
//				aux2 = (Nodo<V>) aux;
//				aux = (Nodo<V>) aux.getSiguiente();
//			}
//		}
//	}

}
