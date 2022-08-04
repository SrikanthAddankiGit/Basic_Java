package FilerDemoPro;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo {

	public static void main(String[] args) {
		List<String> ls = new ArrayList<>();
		List<String> m = new ArrayList<>();
		ls.add("red");
		ls.add("red");
		ls.add("green");
		ls.add("white");
		for(String s: ls) {
			if(!s.equalsIgnoreCase("red")) {
				m.add(s);
			}
		}
		System.out.println(m);
	}

}
