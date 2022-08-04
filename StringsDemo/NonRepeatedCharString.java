package StringsDemo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NonRepeatedCharString {

	public static void main(String[] args) {
		
		char c = getFirstNonRepeatedChar("aabbddef");
		System.out.println("NOn repeated  character: "+c);
		
	}

	private static char getFirstNonRepeatedChar(String string) {
		Map<Character,Integer> count = new LinkedHashMap<Character,Integer>();
		for(char ch:string.toCharArray()) {
			count.put(ch, count.containsKey(ch) ? count.get(ch)+1:1);
		}
		for(Entry<Character, Integer> entry : count.entrySet()) {
			if(entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		throw new RuntimeException("did'nt find any non repeated character");
	}

}
