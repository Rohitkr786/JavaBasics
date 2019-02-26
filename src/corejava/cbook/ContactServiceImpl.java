package corejava.cbook;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import corejava.cbook.Contact.ContactBuilder;

public class ContactServiceImpl implements ContactService {
	private List<Contact> contacts;

	public ContactServiceImpl() {
	}

	{
		contacts = new ArrayList<>();
		Contact contact = ContactBuilder.newInstance().withEmail("m.rajesh@gmail.com").withMobile("9483685398")
				.withEmpno("101").withName("Rajesh").build();
		contacts.add(contact);
	}

	@Override
	public Contact addContact(Contact contact) {
		if (contact != null) {
			contacts.add(contact);
		} else {
			System.out.println("Error occured while adding Contact " + contact.getName());
		}

		return contact;
	}

	@Override
	public boolean deleteContact(Contact contact) {
		if (contact != null) {
			System.out.println("deleting contact with name " + contact.getName());
			contacts.remove(contact);
			return true;
		}
		return false;
	}

	@Override
	public List<Contact> allContacts() {
		return contacts;
	}

	@Override
	public List<Contact> search(String searchData) {
		List<Contact> searchList = new ArrayList<>();
		if (contacts != null) {
			for (Contact c : contacts) {
				if (c.getName().toLowerCase().contains(searchData.toLowerCase()) || c.getEmpno().contains(searchData)) {
					searchList.add(c);
				}
			}
			return searchList;
		}
		return null;
	}

	@Override
	public Contact udpateContact(Contact contact) {
		if (contact != null) {
			System.out.println("Updating contact with name " + contact.getName());
			contacts.set(0, contact);
		}
		return contact;
	}

	@Override
	public Contact getContact(String empno) {
		Contact con = null;
		if (contacts != null) {
			for (Contact c : contacts) {
				if (c.getEmpno().contains(empno)) {
					con=c;
				}
			}
			return con;
		}
		return null;
	}

}
