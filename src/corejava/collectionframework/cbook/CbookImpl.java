package corejava.collectionframework.cbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CbookImpl implements Cbook {

	
	private Map<String, String> cmap= new HashMap<>();
	
	@Override
	public void addDetails(String phno, String name) {
		if(cmap.containsKey(phno)) {
			System.out.println("Sorry this Contact Already exists... with number "+phno);
		}
		else {
			cmap.put(phno, name);
			System.out.println("Contact added Successfully with name "+name);
		}
	}

	@Override
	public String getName(String phno) {
		String name = cmap.get(phno);
		if(name==null) {
			return "Sorry! No Contact found with the given number "+phno;
		}
		return "Name is : "+name;
	}

	@Override
	public List<Profile> allContacts() {
		List<Profile> list = new ArrayList<>();
		if(cmap.isEmpty()) {
			return null;
		}
		else {
			System.out.println("All Contacts are...");
			Set<Entry<String, String>> entry = cmap.entrySet();
			for(Entry<String, String> e:entry) {
				String phno=e.getKey();
				String name=e.getValue();
				Profile p = Profile.builder().name(name).phno(phno).build();
				list.add(p);
			}
		}
		return list;
	}

}
