package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> fruitMap = new HashMap<>();
		fruitMap.put(1,"Mango");
		fruitMap.put(2,"Apple");
		fruitMap.put(3,"Banana");
		fruitMap.put(4, "Orange");
		
		 KeysetIteration(fruitMap);
	}
	
	
	private static void KeysetIteration(Map<Integer, String> fruitMap) {
	for(Integer fruitId :fruitMap.keySet()) {
		System.out.print(fruitId);
		System.out.print(" ");
		System.out.println(fruitMap.get(fruitId));
	}
		
	}

}
