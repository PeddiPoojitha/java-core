package com.Array;
import java.util.*;

public class Sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements");
		int n=sc.nextInt();
		int sum=0;
		System.out.println("ele:" +n+ "");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];		
		}
		System.out.println("array sum:"+sum);
		sc.close();

	}

}
