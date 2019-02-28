package corejava.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListExample {
	public static void main(String[] args) {
		String data = "Rajesh,sujith,Manju,Venkat,Subhash,Ananth,Rajesh,Manju";
		String arr[]= data.split(",");
		List<String> list = new ArrayList<>();
		for(String s:arr) {
			if(!list.contains(s)) {
				list.add(s);
			}
			else {
				System.out.println("Duplicated value "+s);
			}
		}
		System.out.println(list);
	}
}
