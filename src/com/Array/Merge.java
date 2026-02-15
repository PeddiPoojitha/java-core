package com.Array;
import java.util.*;

public class Merge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements");
		int n=sc.nextInt();
		int m=sc.nextInt();	
		int[] arr1=new int[n];
		System.out.println("");
		int[] arr2=new int[m];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		int[] merge=new int[n+m];
		for(int i=0;i<n;i++) {
			merge[i]=arr1[i];
		}
		for(int i=0;i<m;i++) {
			arr2[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++) {
			merge[n+i]=arr2[i];
		}
		System.out.println("merged array:");
		for(int i:merge) {
			System.out.println(i+"");
		}
		
	
		sc.close();
		
		
		
		

	}

}
