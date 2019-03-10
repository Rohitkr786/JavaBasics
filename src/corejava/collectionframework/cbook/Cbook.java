package corejava.collectionframework.cbook;

import java.util.List;

public interface Cbook {
	public void addDetails(String phno, String name);

	public String getName(String phno);

	List<Profile> allContacts();
}
