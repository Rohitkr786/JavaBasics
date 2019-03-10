package corejava.collectionframework.memberoperations;

public interface MemeberContainer {
	void addMember(String name,String city,String country);
	void deleteMember(String id);
	void searchById(String id);
	void searchMember(String id,String name);
	void displaySorting(String s);
}
