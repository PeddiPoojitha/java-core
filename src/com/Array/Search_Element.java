package com.Array;
import java.util.*;
public class Search_Element {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements:");
		int n=sc.nextInt();
		int search=sc.nextInt();
		System.out.println("elements:"+n+ "");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]==search) {
				System.out.println("Element found at position: " + (i + 1));
				break;
			}
			
		}
		
		sc.close();
		
		

	}

}
