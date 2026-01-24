package _7_1_26_exam;
import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("A:"+a);
		System.out.println("B:"+b);
		sc.close();
		
	}

}
