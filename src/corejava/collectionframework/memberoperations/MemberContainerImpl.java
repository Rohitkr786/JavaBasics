package corejava.collectionframework.memberoperations;

import java.util.ArrayList;
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

}
