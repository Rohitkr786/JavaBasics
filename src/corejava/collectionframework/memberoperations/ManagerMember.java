package corejava.collectionframework.memberoperations;

import java.util.List;

public class ManagerMember {

	public static void main(String[] args) {
		MemberContainerImpl m = MemberContainerImpl.getInstance(); // ADD MEMBER
		m.addMember("LAKSHMAN", "AP", "INDIA");
		m.addMember("RAJESH", "RAICHUR", "INDIA");
		m.addMember("MANJU", "BALLERY", "INDIA");
		m.addMember("GOKUL", "HASSAN", "INDIA");
		m.addMember("ACHAL", "CHIKKABALPUR", "INDIA");
		m.addMember("VARUN", "HYDRABAD", "INDIA");
		List<Member> list = null;
		list = m.getAllMembers();
		showMembers(list);
		m.deleteMember("ASHO5011IND");
		list = m.getAllMembers();
		System.out.println("After deleting ");
		showMembers(list);
	}

	private static void showMembers(List<Member> list) {
		for (Member mc : list) {
			System.out.println("Name " + mc.getName() + " id is " + mc.getMid());
		}
	}

}
