package round2_assisted_pro;

import java.util.Scanner;

public class TryAndCatch {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("this program is related to usage of  try and catch");
		System.out.println("enter value of a=");
		int a=sc.nextInt();
		
		try {
			a=a%0;
			System.out.println("the modulo division of a by 0 is "+a);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
