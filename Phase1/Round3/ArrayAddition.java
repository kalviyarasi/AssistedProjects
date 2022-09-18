package project3;

import java.util.Scanner;

public class ArrayAddition {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		int a[]=new int[n];
		int sum=0;
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the value at index "+i);
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("the sum of the elements in the array= "+sum);
}
}