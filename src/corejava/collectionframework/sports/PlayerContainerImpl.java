package corejava.collectionframework.sports;

import java.util.ArrayList;
import java.util.List;

public class PlayerContainerImpl implements PlayerContainer {
	private List<Player> football = new ArrayList<>();
	private List<Player> cricket = new ArrayList<>();

	@Override
	public void add(Player p) {
		if (p.getSport().toLowerCase().equals("football")) {
			football.add(p);
		} else {
			cricket.add(p);
		}

	}

	@Override
	public List<String> getPlayers(List<Player> football, List<Player> cricket) {
		List<String> list = new ArrayList<>();
		for (Player fb : football) {
			for (Player c : cricket) {
				if (fb.getName().equals(c.getName())) {
					list.add(c.getName());
				}
			}
		}
		return list;
	}

	@Override
	public List<Player> getCricketPlayers() {
		List<Player> list = new ArrayList<>();
		for (Player p : cricket) {
			list.add(p);
		}
		return list;
	}

	@Override
	public List<Player> getFootballPlayers() {
		List<Player> list = new ArrayList<>();
		for (Player p : football) {
			list.add(p);
		}
		return list;
	}

}
