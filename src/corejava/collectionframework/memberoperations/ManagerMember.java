package corejava.collectionframework.memberoperations;

import java.util.List;

public class ManagerMember {

	public static void main(String[] args) {
		MemberContainerImpl m = MemberContainerImpl.getInstance();
		List<Member> list = null;
		// ADDING MEMBERS
		System.out.println("Adding Members............");
		m.addMember("LAKSHMAN", "AP", "INDIA");
		m.addMember("RAJESH", "RAICHUR", "INDIA");
		m.addMember("MANJU", "BALLERY", "INDIA");
		m.addMember("GOKUL", "HASSAN", "INDIA");
		m.addMember("ACHAL", "CHIKKABALPUR", "INDIA");
		m.addMember("VARUN", "HYDRABAD", "INDIA");

		// DISPLAY ALL MEMBERS DATA
		list = m.getAllMembers();
		System.out.println("All Members Data................");
		showMembers(list);

		// SORTING ALL MEMBERS DATA
		String sortType = "DESC";
		List<String> sorted = m.displaySortingOrder(sortType);
		System.out.println("After Sorting................");
		showSortedMembers(sorted);

		// DELETING MEMBER USING ID
		String id = "ASHO5011IND";
		System.out.println("Deleting member using id "+id);
		m.deleteMember(id); // Deleting using ID
		list = m.getAllMembers();
		System.out.println("After deleting............. ");
		showMembers(list);

		// SEARCHING MEMBERS USING ID AND NAME
		id = "ASHO5007IND";
		String name = "MANJU";

		list = m.searchById(id);
		System.out.println("Searching using ID only.." + id);
		showMembers(list);

		list = m.searchMember(id, name);
		System.out.println("Searching using ID " + id + " or Name " + name);
		showMembers(list);
	}

	private static void showSortedMembers(List<String> sorted) {
		System.out.println("Sorted list is ");
		for (String name : sorted) {
			System.out.println("\t" + name);
		}
	}

	private static void showMembers(List<Member> list) {
		for (Member mc : list) {
			System.out.println(" ID : " + mc.getMid() + " , Name : " + mc.getName() + " , City : " + mc.getCity()
					+ " , Country : " + mc.getCountry());
		}
		System.out.println("Members count "+list.size());
	}

}
