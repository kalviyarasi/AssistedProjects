package project4;

import java.util.Scanner;

public class Linear_Search {
	public static void main(String[] args) {
		int a[]= {45,8,263,8,3,7,9,23};
		int flag=0;
		System.out.println("enter the element to search");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==s)
			{
				flag=1;
				System.out.println("the element "+s+" is found in "+i);
			}		
	}
     if(flag==0)
{
		System.out.println("the element is not found");

}
}}
