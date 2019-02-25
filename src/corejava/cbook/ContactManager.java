package corejava.cbook;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import corejava.cbook.Contact.ContactBuilder;

public class ContactManager implements ContactService {
	//ContactManager cmg = new ContactManager();

	private static List<Contact> contacts;

	{
		contacts = new ArrayList<>();
		try (Stream<String> stream = Files
				.lines(Paths.get("R:\\Java-Basics-Ws\\CoreJava\\src\\corejava\\cbook\\cinfo.txt"))) {
			stream.forEach(e -> {
				String arr[] = e.split(",");
				String empno = arr[0];
				String name = arr[1];
				String email = arr[2];
				String mobile = arr[3];
				Contact contact = ContactBuilder.newInstance().withEmail(email).withMobile(mobile).withEmpno(empno)
						.withName(name).build();
				contacts.add(contact);
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ContactManager() {

	}

	public List<Contact> allContacts() {
		return contacts;
	}

	public List<Contact> search(String name) {
		List<Contact> searchList = new ArrayList<>();
		for (Contact contact : contacts) {
			if (contact.getName().toLowerCase().contains(name.toLowerCase())) {
				searchList.add(contact);
			}
		}
		return searchList;
	}

	@Override
	public List<Contact> addContact(Contact contact) {
		System.out.println("Adding Contact ");
		String name = "Rajesh";
		String empno = "102";
		String email = "rajesh.m@gmail.com";
		String phno = "9483685398";
		Contact con = ContactBuilder.newInstance().withName(name).withEmpno(empno).withEmail(email).withMobile(phno)
				.build();
		List<Contact> newContact = new ArrayList<>();
		newContact.add(con);
		return newContact;
	}

	@Override
	public boolean deleteContact(Contact contact) {
		/*
		 * System.out.println("Deleting Contact......"); String name = "Rajesh"; String
		 * empno = "102"; String email = "rajesh.m@gmail.com"; String phno =
		 * "9483685398"; Contact con =
		 * ContactBuilder.newInstance().withName(name).withEmpno(empno).withEmail(email)
		 * .withMobile(phno) .build();
		 * 
		 * boolean del = contacts.remove(con);
		 */
		return false;
	}

	@Override
	public Contact udpateContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact getContact(String empno) {
		for (Contact c : contacts) {
			if (c.getEmpno().contains(empno)) {
				System.out.println("Name is " + c.getName());
			}
		}
		return null;
	}

	/*public void getc(String empno) {
		List<Contact> list = cm.allContacts();
		for (Contact c : list) {
			if (c.getEmpno().contains(empno)) {
				System.out.println("Name is " + c.getName());
			}
		}
	}
	*/

}
