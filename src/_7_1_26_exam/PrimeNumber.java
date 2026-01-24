package _7_1_26_exam;

import java.util.Scanner;

public class PrimeNumber {
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(num);i++) {
			while(num%i==0) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean isPrime=isPrime(num);
		if(isPrime) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("not prime number");
		}
		sc.close();
		

	}

}
