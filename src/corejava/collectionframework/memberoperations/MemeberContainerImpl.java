package corejava.collectionframework.memberoperations;

import java.util.ArrayList;
import java.util.List;

public class MemeberContainerImpl implements MemeberContainer {

	private List<Member> list = new ArrayList<>();
	private Member m= null;
	@Override
	public void addMember(String name, String city, String country) {
		String mid=MemberIdGenerator.getMemeberId();
		m = Member.builder().name(name).mid(mid).city(city).country(country).build();
		list.add(m);
	}

	@Override
	public void deleteMember(String id) {

	}

	@Override
	public void searchById(String id) {

	}

	@Override
	public void searchMember(String id, String name) {

	}

	@Override
	public void displaySorting(String s) {

	}

}
