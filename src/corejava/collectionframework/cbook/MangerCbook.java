package corejava.collectionframework.cbook;

import java.util.List;

public class MangerCbook {

	public static void main(String[] args) {
		Cbook cb = new CbookImpl();
		cb.addDetails("9876524120", "RAJESH");
		String searchNumber="9876524120";
		cb.addDetails("9876524121", "RAMESH");
		cb.addDetails("9876524120", "RAMU");
		List<Profile> list = cb.allContacts();
		show(list);
		System.out.println(cb.getName(searchNumber));
		searchNumber="9876524122";
		System.out.println(cb.getName(searchNumber));
		
	}

	private static void show(List<Profile> list) {
		for(Profile p:list) {
			System.out.println("Name :- "+p.getName()+" & Number :- "+p.getPhno());
		}
	}

}
