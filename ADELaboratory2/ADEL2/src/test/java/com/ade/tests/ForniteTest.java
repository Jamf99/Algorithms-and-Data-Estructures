package com.ade.tests;

import java.util.ArrayList;

import org.junit.Test;

import com.ade.model.Player;

import junit.framework.TestCase;

public class ForniteTest extends TestCase{
	
	private Player player;
	
	private void stage1() {
		ArrayList<Player> players = new ArrayList<Player>();
		for (int i = 0; i < 1000000; i++) {
			player = new Player("ninja" + i, Math.random() * 50, (int) Math.random() * 1000, (int) Math.random() * 1000, Math.random() * 500, 0);
			players.add(player);
		}
		for (int i = 0; i < players.size(); i++) {
			System.out.println(players.get(i).getName());
		}
	}
	
	@Test
	public void test() {
		stage1();
		assertTrue(true);
		
	}

}
