package corejava.collectionframework.memberoperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MemberContainerImpl implements MemberContainer {

	private List<Member> list = new ArrayList<>();
	private Member m = null;

	private MemberContainerImpl() {

	}

	private static MemberContainerImpl obj;

	public static synchronized MemberContainerImpl getInstance() {
		if (obj == null) {
			obj = new MemberContainerImpl();
		}
		return obj;
	}

	@Override
	public void addMember(String name, String city, String country) {
		String id = MemberIdGenerator.getMemeberId();
		m = Member.builder().name(name).mid(id).city(city).country(country).build();
		list.add(m);
	}

	@Override
	public void deleteMember(String id) {
		List<Member> searchList = searchById(id);
		if (!(searchList.isEmpty())) {
			for (Member m : searchList) {
				list.remove(m);
			}
		} else {
			System.out.println("No member found");
		}
	}

	@Override
	public void displaySorting(String s) {

	}

	@Override
	public List<Member> getAllMembers() {
		List<Member> memberList = new ArrayList<>();
		for (Member m : list) {
			memberList.add(m);
		}
		return memberList;
	}

	@Override
	public List<Member> searchById(String id) {
		List<Member> searchList = new ArrayList<>();
		if (list.isEmpty()) {
			System.out.println("Member list is Empty..!");
			return null;
		} else {
			for (Member m : list) {
				if (m.getMid().equals(id)) {
					searchList.add(m);
				}
			}
		}
		if (searchList.isEmpty())
			System.out.println("Sorry! No member found");

		return searchList;
	}

	@Override
	public List<Member> searchMember(String id, String name) {
		List<Member> searchList = new ArrayList<>();
		if (list.isEmpty()) {
			System.out.println("Member list is Empty..!");
			return null;
		} else {
			for (Member m : list) {
				if (m.getMid().equals(id) || m.getName().equals(name)) {
					searchList.add(m);
				}
			}
		}
		if (searchList.isEmpty())
			System.out.println("Sorry! No member found");

		return searchList;
	}

	@Override
	public List<String> displaySortingOrder(String s) {
		List<String> sortedList = new ArrayList<>();
		if (s.startsWith("ASC")) {
			System.out.println("Sorting by Ascending order....................");
			Collections.sort(list, new CompareingAsc());
		}
		else {
			System.out.println("Sorting by Descending order....................");
			Collections.sort(list, new CompareingDesc());
		}
		for (Member m : list) {
			sortedList.add(m.getName());
			// System.out.println(m.getName());
		}
		return sortedList;
	}

}

class CompareingAsc implements Comparator<Member> {

	@Override
	public int compare(Member m1, Member m2) {
		System.out.println("Comparing " + m1.getName() + " and " + m2.getName());
		return m1.getName().compareTo(m2.getName());
	}

}

class CompareingDesc implements Comparator<Member> {
	@Override
	public int compare(Member m1, Member m2) {
		System.out.println("Comparing " + m1.getName() + " and " + m2.getName());
		return m2.getName().compareTo(m1.getName());
	}

	
	}
