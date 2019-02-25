package corejava.cbook;

import java.util.List;
import java.util.Scanner;

public class Manager {
	public static void main(String[] args) {
		ContactManager cm = new ContactManager();
		List<Contact> addContact = cm.addContact(null);
		List<Contact> allcon=cm.allContacts();
		for(Contact c:addContact) {
			System.out.println(c.getName()+" "+c.getEmpno()+" "+c.getMobile());
		}
		//cm.getc("102");
		String name = "rajes";
		List<Contact> list = cm.search(name);
		if (list.isEmpty()) {
			System.out.println("No contact found for the given search string :"+ name);
		} else {
			for (Contact c : list) {
				System.out.println(c.getEmpno() + " " + c.getName());
			}
		}
	}
}
