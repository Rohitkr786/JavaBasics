package corejava.cbook;

import java.util.List;

public interface ContactService {
	
		public List<Contact> addContact(Contact contact);
		public boolean deleteContact(Contact contact);
		public List<Contact> allContacts();
		public List<Contact> search(String searchData);
		public Contact udpateContact(Contact contact);
		public Contact getContact(String empno);
	
}
