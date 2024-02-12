package map_Collections.com;

import java.util.*;

public class Map_Collections {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Dog");
		map.put(2, "Elephant");
		map.put(3, "Tiger");
		System.out.println(map);		
		System.out.println(map.size());		
		System.out.println(map.size()-1);		
		System.out.println(map.containsKey(2));		
		System.out.println(map.containsValue("Harish"));		
		System.out.println(map.isEmpty());
		System.out.println(map.get(2));		
		System.out.println(map.keySet());		
		System.out.println(map.values());
		System.out.println(map.entrySet());		
		map.clear();
		System.out.println(map);		
	}
}
