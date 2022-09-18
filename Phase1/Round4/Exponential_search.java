package project4;

import java.util.Arrays;
import java.util.Scanner;
class exponential
{
    static int exponentialSearch(int arr[], int n, int x)
    {
        if (arr[0] == x)
            return 0;

        int i = 1;
        while (i < n && arr[i] <= x)
            i = i*2;
   
        return Arrays.binarySearch(arr, i/2, Math.min(i, n-1), x);
    }
}
public class Exponential_search {
	public static void main(String[] args) {
	int a[]= {45,8,263,8,3,7,9,23};
	System.out.println("enter the element to search");
	Scanner sc=new Scanner(System.in);
	int s=sc.nextInt();
	exponential e=new exponential();
	int result = e.exponentialSearch(a, a.length, s);

System.out.println((result < 0) ? 
"Element is not present in array" :
"Element is present at index " + 
       result);
	
}}