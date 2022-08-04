package ArrayDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteAnArray {
	
	
	
	public static void main(String[] args) {
		String [] str = {"Red","Green","Blue"};
		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<String> ls = new ArrayList(Arrays.asList(str));
		System.out.println(ls);
		
		ls.remove(1);
		ls.remove("Blue");
		System.out.println("Removed list: "+ls);
	}

}
