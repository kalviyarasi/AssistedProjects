package project3;

import java.util.Arrays;
import java.util.Scanner;

public class FourthSmallest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the array size");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter the array elements");
	for(int i=0;i<n;i++) {
a[i]=sc.nextInt();
	}
Arrays.sort(a);
System.out.println("the 4th smallest element="+a[3]);
	
}}
