package ArrayDemo;

public class IndexArray {

	public static void main(String[] args) {
		
		int index = 0;
		String a[] = {"hello","Java","SpringBoot"};
		for(int i=0; i<a.length; i++) {
			if(a[i] == "Java") {
				index = i;
			}
		}
		System.out.println(index);
	}

}
