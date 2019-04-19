package corejava.collectionframework.sports;

import java.util.Comparator;

public class PlayersSortByName implements Comparator<Player> {
	@Override
	public int compare(Player p1, Player p2) {
		return p1.getName().compareTo(p2.getName()); //ASCENDING ORDER 
	}

}
