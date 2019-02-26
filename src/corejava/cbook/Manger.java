package corejava.cbook;

import java.util.List;

public class Manger {

	public static void main(String[] args) {
		ContactService cs = new ContactServiceImpl();
		System.out.println("Displaying all Contacts ");
		List<Contact> list = cs.allContacts();
		paintData(list);
		Contact c = Contact.ContactBuilder.newInstance().withName("Gokul").withEmail("gokul@gmail.com")
				.withMobile("7892660265").withEmpno("102").build();
		Contact added = cs.addContact(c);
		System.out.println("After adding contact " + added.getName());
		paintData(list);
		String s = "raj";
		List<Contact> search = cs.search(s);
		System.out.println("Searching with name :"+s);
		paintData(search);
		System.out.println("Deleting... Contact ");
		System.out.println("Delete Status :- "+cs.deleteContact(c));
		paintData(list);
		String empno="101";
		System.out.println("Get Contact with empno "+empno);
		Contact getEmpNo = cs.getContact(empno);
		paintData(getEmpNo);
		System.out.println("Updating... Contact ");
		cs.udpateContact(c);
		paintData(list);
		
	}

	private static void paintData(List<Contact> list) {
		for (Contact c : list) {
			System.out.println(c.getName() + " " + c.getEmail());
		}
	}
	private static void paintData(Contact con) {
		System.out.println("Emp no "+con.getEmpno()+" Name is "+con.getName()+" Mobile is "+con.getMobile());
	}

}
