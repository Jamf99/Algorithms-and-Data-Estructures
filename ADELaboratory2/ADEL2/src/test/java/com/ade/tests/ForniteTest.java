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
	private Fornite fornite;
	
	private void stage1() {
		player = new Player("Ninja", 60, 20, 20, 50, 0);
		boolean plataform = player.getPlataform() == 0 ? false : true;
		fornite = new Fornite(plataform);
	}
	@Test
	public void testAddPlayer() {
		stage1();
		fornite.addPlayer(player, false);
		assertNotNull(fornite.getProLow().getFront());
	}
	
	private void stage2() {
		player = new Player("Ninja", 60, 20, 20, 50, 1);
		boolean plataform = player.getPlataform() == 0 ? false : true;
		fornite = new Fornite(plataform);
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
		player = new Player("Cristian", 0, 1, 10, 0, 0);
		boolean plataform = player.getPlataform() == 0 ? false : true;
		fornite = new Fornite(plataform);
	}
	@Test
	public void testclasifyByGameProwessWithoutPlataform1() {
		stage3();
		fornite.addPlayer(player, false);
		assertNotNull(fornite.getNoobLow().getFront());
	}
	
	private void stage4() {
		player = new Player("Gamarra", 0, 1, 10, 200, 0);
		boolean plataform = player.getPlataform() == 0 ? false : true;
		fornite = new Fornite(plataform);
	}
	@Test
	public void testclasifyByGameProwessWithoutPlataform2() {
		stage4();
		fornite.addPlayer(player, false);
		assertNotNull(fornite.getNoobMid().getFront());
	}
	
	private void stage5() {
		player = new Player("CamiloBarrios", 0, 1, 10, 500, 0);
		boolean plataform = player.getPlataform() == 0 ? false : true;
		fornite = new Fornite(plataform);
	}
	@Test
	public void testclasifyByGameProwessWithoutPlataform3() {
		stage5();
		fornite.addPlayer(player, false);
		assertNotNull(fornite.getNoobHigh().getFront());
	}
	
	private void stage6() {
		player = new Player("Reyes", 20, 20, 20, 50, 0);
		boolean plataform = player.getPlataform() == 0 ? false : true;
		fornite = new Fornite(plataform);
	}
	@Test
	public void testclasifyByGameProwessWithoutPlataform4() {
		stage6();
		fornite.addPlayer(player, false);
		assertNotNull(fornite.getMediumLow().getFront());
	}
	
	private void stage7() {
		player = new Player("LolitoFdz", 20, 20, 20, 200, 0);
		boolean plataform = player.getPlataform() == 0 ? false : true;
		fornite = new Fornite(plataform);
	}
	@Test
	public void testclasifyByGameProwessWithoutPlataform5() {
		stage7();
		fornite.addPlayer(player, false);
		assertNotNull(fornite.getMediumMid().getFront());
	}
	
	private void stage8() {
		player = new Player("Norha", 20, 20, 20, 1000, 0);
		boolean plataform = player.getPlataform() == 0 ? false : true;
		fornite = new Fornite(plataform);
	}
	@Test
	public void testclasifyByGameProwessWithoutPlataform6() {
		stage8();
		fornite.addPlayer(player, false);
		assertNotNull(fornite.getMediumHigh().getFront());
	}
	
	private void stage9() {
		player = new Player("Dakotaz", 50, 20, 20, 100, 0);
		boolean plataform = player.getPlataform() == 0 ? false : true;
		fornite = new Fornite(plataform);
	}
	@Test
	public void testclasifyByGameProwessWithoutPlataform7() {
		stage9();
		fornite.addPlayer(player, false);
		assertNotNull(fornite.getProLow().getFront());
	}
	
	private void stage10() {
		player = new Player("Ninja", 50, 20, 20, 200, 0);
		boolean plataform = player.getPlataform() == 0 ? false : true;
		fornite = new Fornite(plataform);
	}
	@Test
	public void testclasifyByGameProwessWithoutPlataform8() {
		stage10();
		fornite.addPlayer(player, false);
		assertNotNull(fornite.getProMid().getFront());
	}
	
	private void stage11() {
		player = new Player("KingRichard", 50, 20, 20, 1000, 0);
		boolean plataform = player.getPlataform() == 0 ? false : true;
		fornite = new Fornite(plataform);
	}
	@Test
	public void testclasifyByGameProwessWithoutPlataform9() {
		stage11();
		fornite.addPlayer(player, false);
		assertNotNull(fornite.getProHigh().getFront());
	}
	
	private void stage12() {
		player = new Player("Cristian", 0, 1, 10, 0, 1);
		boolean plataform = player.getPlataform() == 0 ? false : true;
		fornite = new Fornite(plataform);
	}
	@Test
	public void testMatchPlayersWithPlataformMode1() {
		stage12();
		fornite.addPlayer(player, true);
		assertNotNull(fornite.getPlataforms()[player.getPlataform()].getNoobLow().getFront());
	}
	
	private void stage13() {
		player = new Player("Gamarra", 0, 1, 10, 200, 1);
		boolean plataform = player.getPlataform() == 0 ? false : true;
		fornite = new Fornite(plataform);
	}
	@Test
	public void testMatchPlayersWithPlataformMode2() {
		stage13();
		fornite.addPlayer(player, true);
		assertNotNull(fornite.getPlataforms()[player.getPlataform()].getNoobMid().getFront());
	}
	
	private void stage14() {
		player = new Player("CamiloBarrios", 0, 1, 10, 500, 2);
		boolean plataform = player.getPlataform() == 0 ? false : true;
		fornite = new Fornite(plataform);
	}
	@Test
	public void testMatchPlayersWithPlataformMode3() {
		stage14();
		fornite.addPlayer(player, true);
		assertNotNull(fornite.getPlataforms()[player.getPlataform()].getNoobHigh().getFront());
	}
	
	private void stage15() {
		player = new Player("Reyes", 20, 20, 20, 50, 2);
		boolean plataform = player.getPlataform() == 0 ? false : true;
		fornite = new Fornite(plataform);
	}
	@Test
	public void testMatchPlayersWithPlataformMode4() {
		stage15();
		fornite.addPlayer(player, true);
		assertNotNull(fornite.getPlataforms()[player.getPlataform()].getMediumLow().getFront());
	}
	
	private void stage16() {
		player = new Player("LolitoFdz", 20, 20, 20, 200, 3);
		boolean plataform = player.getPlataform() == 0 ? false : true;
		fornite = new Fornite(plataform);
	}
	@Test
	public void testMatchPlayersWithPlataformMode5() {
		stage16();
		fornite.addPlayer(player, true);
		assertNotNull(fornite.getPlataforms()[player.getPlataform()].getMediumMid().getFront());
	}
	
	private void stage17() {
		player = new Player("Norha", 20, 20, 20, 1000, 3);
		boolean plataform = player.getPlataform() == 0 ? false : true;
		fornite = new Fornite(plataform);
	}
	@Test
	public void testMatchPlayersWithPlataformMode6() {
		stage17();
		fornite.addPlayer(player, true);
		assertNotNull(fornite.getPlataforms()[player.getPlataform()].getMediumHigh().getFront());
	}
	
	private void stage18() {
		player = new Player("Dakotaz", 50, 20, 20, 100, 4);
		boolean plataform = player.getPlataform() == 0 ? false : true;
		fornite = new Fornite(plataform);
	}
	@Test
	public void testMatchPlayersWithPlataformMode7() {
		stage18();
		fornite.addPlayer(player, true);
		assertNotNull(fornite.getPlataforms()[player.getPlataform()].getProLow().getFront());
	}
	
	private void stage19() {
		player = new Player("Ninja", 50, 20, 20, 200, 4);
		boolean plataform = player.getPlataform() == 0 ? false : true;
		fornite = new Fornite(plataform);
	}
	@Test
	public void testMatchPlayersWithPlataformMode8() {
		stage19();
		fornite.addPlayer(player, true);
		assertNotNull(fornite.getPlataforms()[player.getPlataform()].getProMid().getFront());
	}
	
	private void stage20() {
		player = new Player("KingRichard", 50, 20, 20, 1000, 4);
		boolean plataform = player.getPlataform() == 0 ? false : true;
		fornite = new Fornite(plataform);
	}
	@Test
	public void testMatchPlayersWithPlataformMode9() {
		stage20();
		fornite.addPlayer(player, true);
		assertNotNull(fornite.getPlataforms()[player.getPlataform()].getProHigh().getFront());
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