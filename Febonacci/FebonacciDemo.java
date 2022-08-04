package Febonacci;

public class FebonacciDemo {

	public static void main(String[] args) {
		
		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		int max = 10;
		
		for(int i = 1; i <= max; i++) {
			System.out.print(sum+" ");
			sum = n1+n2;
			n1 = n2;
			n2 = sum;
		}
		
		
	}

}



