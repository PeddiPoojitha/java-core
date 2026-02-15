package com.Array;
import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements:");
		int n=sc.nextInt();
		System.out.println("elements" +n+ "");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("array in reverse order:");
		for(int i=n-1;i>0;i--) {
			System.out.println(arr[i]+"");
			
		}
		sc.close();
		

	}

}
