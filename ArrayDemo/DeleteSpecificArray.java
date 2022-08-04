package ArrayDemo;

import java.util.Arrays;

public class DeleteSpecificArray {
	
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		System.out.println("Original array: "+Arrays.toString(arr));
		int index=2;
		
		
//		k      i    index    new 
//		0      0      2       1
//		1      1      2       2
//		2      2      2       -
//		2      3      2       4
//		3      4      2       5
//		4      5      -       -
		int newArr[] = new int[arr.length-1];
		for(int i=0 ,k=0; i < arr.length;i++) {
			if(i == index) {
				continue;
			}
			newArr[k++] = arr[i];
		}
		System.out.println("New array: "+Arrays.toString(newArr));
	}
}
