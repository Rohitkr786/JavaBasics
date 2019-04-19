package corejava.collectionframework.sports;

import java.util.List;

public class ManagerSports {

	public static void main(String[] args) {
		System.out.println("Welcome to Sports Club");
		PlayerContainer pc = new PlayerContainerImpl();
		Player p = null;
		p = Player.builder().name("RAJESH").age(21).city("BLR").state("KA").sport("CRICKET").build();
		pc.add(p);
		p = Player.builder().name("LOKESH").age(21).city("HYD").state("TS").sport("CRICKET").build();
		pc.add(p);
		p = Player.builder().name("GOKUL").age(22).city("HASSAN").state("KA").sport("CRICKET").build();
		pc.add(p);
		p = Player.builder().name("GOKUL").age(22).city("HASSAN").state("KA").sport("FOOTBALL").build();
		pc.add(p);
		p = Player.builder().name("RAJESH").age(21).city("BLR").state("KA").sport("FOOTBALL").build();
		pc.add(p);
		p = Player.builder().name("LOKESH").age(21).city("HYD").state("TS").sport("FOOTBALL").build();
		pc.add(p);
		p = Player.builder().name("MANJU").age(21).city("BALLERY").state("KA").sport("CRICKET").build();
		pc.add(p);
		List<Player> football = pc.getFootballPlayers();
		List<Player> cricket = pc.getCricketPlayers();
		List<Player> commonPlayerList = pc.getCommonPlayers(football, cricket);
		showPlayers(football);
		showPlayers(cricket);
		System.out.println("Common players who play both games.................");
		showCommonPlayers(commonPlayerList);

	}


	private static void showPlayers(List<Player> sport) {
		System.out.println("Players Data.................");
		for (Player p : sport) {
			System.out.println("Name " + p.getName());
			System.out.println("Age " + p.getAge());
			System.out.println("Sport " + p.getSport());
			System.out.println("City " + p.getCity());
			System.out.println("State " + p.getState());
			System.out.println("-----------------------------");
		}
	}
	private static void showCommonPlayers(List<Player> sport) {
		System.out.println("Sorting by Ascending order");
		for (Player p : sport) {
			System.out.println("Name : " + p.getName() );
		}
	}
}
