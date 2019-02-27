package corejava.datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maps {

	public static void main(String[] args) {
		cubes();
		System.out.println("-----------------------------");
		mapOperations();
	}

	private static void mapOperations() {
		Map<String, List<Integer>> map = new HashMap<>();
		String data = "rajesh-9483685,manju-7892660,rajesh-789266,sujith-7485174,manju-9905512";
		String[] d= data.split(",");
		for(String dd:d) {
			String darr[] = dd.split("-");
			String name = darr[0]; 
			int num = Integer.parseInt(darr[1]);
			if(map.get(name)==null) {
				List<Integer> numb = new ArrayList<>();
				numb.add(num);
				map.put(name, numb);
			}
			else {
				List<Integer> ls = map.get(name);
				ls.add(num);
				map.put(name, ls);
			}
		}
		System.out.println(map);
		System.out.println("-------------------");
		Set<String> key = map.keySet();
		for(String s:key) {
			System.out.println("Name is "+s+" & number is "+map.get(s));
		}
	}

	private static void cubes() {
		Map<Integer, Integer> map = new HashMap<>();
		
		List<Integer> list = Arrays.asList(new Integer[] {1,2,3,4,5,6,7});
		for(Integer i:list) {
			map.put(i, i*i*i);
		}
		System.out.println(map); //one way
		Set<Integer> keys = map.keySet(); //second way
		for(Integer k:keys) {
			System.out.println("Key is "+k+" value is "+map.get(k));
		}
		Set<Entry<Integer, Integer>> entry = map.entrySet(); //third way
		for(Entry<Integer, Integer> e:entry) {
			System.out.println("Key is "+e.getKey()+ " Value => "+e.getValue());
		}
		
		Collection<Integer> val = map.values(); //third values we get here
		for(Integer c:val) {
			System.out.println(c);
		}
	}

}
