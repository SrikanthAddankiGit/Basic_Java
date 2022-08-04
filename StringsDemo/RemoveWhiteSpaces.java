package StringsDemo;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String s = "abcdef   ghig    abcdef";
		String v = s.replaceAll("\\s+","");
		System.out.println(v);
		
		

	}

	
}
