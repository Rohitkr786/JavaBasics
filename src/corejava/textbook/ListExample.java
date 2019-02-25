package corejava.textbook;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(104);
		int n=0;
		ListIterator<Integer> lt = list.listIterator();
		while(lt.hasNext()) {
			n=lt.next();
			System.out.println(n);
		}
		while(lt.hasPrevious()) {
			n=lt.previous();
			System.out.println(n);
			}
	}

}
