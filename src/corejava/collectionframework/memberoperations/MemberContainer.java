package corejava.collectionframework.memberoperations;

import java.util.List;

public interface MemberContainer {
	void addMember(String name, String city, String country);

	void deleteMember(String id);

	List<Member> searchById(String id);

	List<Member> searchMember(String id, String name);

	void displaySorting(String s);

	List<Member> getAllMembers();
}
