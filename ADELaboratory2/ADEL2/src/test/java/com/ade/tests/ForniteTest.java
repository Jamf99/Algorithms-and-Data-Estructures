package com.ade.tests;

import java.util.ArrayList;

import org.junit.Test;

import com.ade.model.Fornite;
import com.ade.model.Plataform;
import com.ade.model.Player;

import junit.framework.TestCase;

public class ForniteTest extends TestCase{
	
	private Player player;
//	private Plataform plataform;
//	private Plataform plataformP;
//	private Plataform plataformX;
//	private Plataform plataformN;
//	private Plataform plataformS;
//	private Plataform plataformPC;
	private Fornite fornite;
	
	private void stage1() {
		fornite = new Fornite();
		fornite = new Fornite(1);
		player = new Player("Ninja", 60, 20, 20, 50, 0);
		fornite.addPlayer(player, false);
	}
	@Test
	public void testAddPlayer() {
		stage1();
		assertNotNull(fornite.getProLow().getFront());
	}
	
	private void stage2() {
		fornite = new Fornite();
	}
	@Test
	public void testGetPlataform() {
		stage2();
		Plataform plataformPlay = new Plataform("PlayStation");
		Plataform plataformXbox = new Plataform("Xbox");
		Plataform plataformNintendo = new Plataform("Nintendo Switch");
		Plataform plataformSmartphone = new Plataform("Smartphone");
		Plataform plataformPC = new Plataform("PC");
		boolean test = false;
		test = plataformPlay.getName().equals(fornite.getPlataforms()[0].getName());
		test = plataformXbox.getName().equals(fornite.getPlataforms()[1].getName());
		test = plataformNintendo.getName().equals(fornite.getPlataforms()[2].getName());
		test = plataformSmartphone.getName().equals(fornite.getPlataforms()[3].getName());
		test = plataformPC.getName().equals(fornite.getPlataforms()[4].getName());
		assertTrue(test);
	}
	
	private void stage3() {
		fornite = new Fornite();
		fornite = new Fornite(1);
		player = new Player("Sarna", 0, 0, 0, 0, 0);
		fornite.addPlayer(player, false);
	}
	@Test
	public void testclasifyByGameProwessWithoutPlataform1() {
		stage3();
		assertNotNull(fornite.getNoobLow().getFront());
	}
	
	private void stage4() {
		fornite = new Fornite();
		fornite = new Fornite(1);
		player = new Player("Gamarra", 0, 0, 0, 200, 0);
		fornite.addPlayer(player, false);
	}
	@Test
	public void testclasifyByGameProwessWithoutPlataform2() {
		stage4();
		assertNotNull(fornite.getNoobMid().getFront());
	}
	
	private void stage5() {
		fornite = new Fornite();
		fornite = new Fornite(1);
		player = new Player("CamiloBarrios", 50, 0, 0, 500, 0);
		fornite.addPlayer(player, false);
	}
	@Test
	public void testclasifyByGameProwessWithoutPlataform3() {
		stage5();
		assertNotNull(fornite.getNoobHigh().getFront());
	}
	
	private void stage6() {
		fornite = new Fornite();
		fornite = new Fornite(1);
		player = new Player("Reyes", 60, 20, 20, 50, 0);
		fornite.addPlayer(player, false);
	}
	@Test
	public void testclasifyByGameProwessWithoutPlataform4() {
		stage6();
		assertNotNull(fornite.getProLow().getFront());
	}
	
	
	
//	private void stage4() {
//		fornite = new Fornite();
//		fornite = new Fornite(1);
//		player = new Player("Ninja", 60, 20, 20, 50, 0);
//		fornite.addPlayer(player, false);
//	}
//	@Test
//	public void testclasifyByGameProwessWithoutPlataform2() {
//		stage4();
//		assertNotNull(fornite.getProLow());
//	}
//	private void stage2() {
//		ArrayList<Player> players = new ArrayList<Player>();
//		for (int i = 0; i < 1000000; i++) {
//			player = new Player("ninja" + i, Math.random() * 50, (int) Math.random() * 1000, (int) Math.random() * 1000, Math.random() * 500, 0);
//			players.add(player);
//		}
//	}
}