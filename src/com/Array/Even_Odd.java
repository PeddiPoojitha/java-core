package com.Array;

import java.util.*;

public class Even_Odd {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of elements");
		int n=sc.nextInt();
		int evenCount=0;
		int oddCount=0;
		System.out.println("elements:" +n+ "");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
			
		}
		System.out.println("even:"+evenCount);
		System.out.println("odd:"+oddCount);
		sc.close();
		

	}

}
