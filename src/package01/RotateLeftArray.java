package package01;

import java.util.Arrays;
import java.util.Scanner;

public class RotateLeftArray {

	public static void main(String[] args) {
//		Type a program like; given an array whose length is 3, 
//		return an array with the elements "rotated left"
//		For example; if the array is [1, 2, 3] output will be [2, 3, 1].
		int arr[]= new int[3];
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 3 numbers");
		//user created array
		for(int i=0; i<3; i++) {
			arr[i]=scan.nextInt();//take input from user
		}

		//this is just try
		//this is for conflict
		//switching first and last element

		//this will switch the places of first and second elements

		System.out.println("Before rotating "+Arrays.toString(arr));
		//temp variable to store one of the element of the array
		
		//printing the original array
		System.out.println("Before rotating "+Arrays.toString(arr));
		//switching first and last element

		int temp = arr[0];
		//arr[0] is the third element
		arr[0]=arr[2];
		//arr[2] which is the last element has the first value now
		arr[2]= temp;
		//printing the rotated array
		System.out.println("Rotated List "+ Arrays.toString(arr));
		scan.close();
	}

}
