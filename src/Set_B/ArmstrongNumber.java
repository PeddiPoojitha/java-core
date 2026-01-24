package Set_B;
import java.util.Scanner;

public class ArmstrongNumber {
	public int getPower(int base,int exp) {
		int res=1;
		for(int i=1;i<=exp;i++) {
			res=res*base;
		}
		return res;	
	}
	public int getCount(int n) {
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		return count;
	}
	public boolean Armstrong(int n) {
		int orginal=n;
		int count=getCount(n);
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum=sum+getPower(rem,count);
			n=n/10;
		}
		return sum==orginal;
	}
	public static void main(String[] args) {
		ArmstrongNumber obj=new ArmstrongNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		if(obj.Armstrong(n)) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("not Armstrong");
		}
		sc.close();
		
		

	}

}
