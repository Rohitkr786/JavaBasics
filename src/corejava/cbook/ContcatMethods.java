package corejava.cbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import corejava.cbook.Contact.ContactBuilder;

public class ContcatMethods implements ContactService {
	public Scanner sc = new Scanner(System.in);

	@Override
	public List<Contact> addContact(Contact contact) {
		System.out.println("Adding Contact ");
		String name = "Rajesh";
		String empno = "102";
		String email = "rajesh.m@gmail.com";
		String phno = "9483685398";
		Contact con = ContactBuilder.newInstance().withName(name).withEmpno(empno).withEmail(email).withMobile(phno)
				.build();
		ContactManager sm = new ContactManager();
		return sm.addContact(con);
	}

	@Override
	public boolean deleteContact(Contact contact) {
		
		
		return false;
	}

	@Override
	public List<Contact> allContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> search(String searchData) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact udpateContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact getContact(String empno) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	


}
