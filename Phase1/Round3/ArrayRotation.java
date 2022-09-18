package project3;
import java.util.Scanner;
class GFG {
    void rightRotate(int arr[], int d, int n)
    {
        for (int i = n; i > d; i--)
 
        
            rightRotatebyOne(arr, n);
    }
 
   
    void rightRotatebyOne(int arr[], int n)
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }
    void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }}
 
public class ArrayRotation {
public static void main(String[] args) {
	 GFG rotate = new GFG();
	System.out.println("enter the array size");
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int n=5;//number of rotation
	System.out.println("enter the array elements");
	int a[]=new int[size];
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	}

	 rotate.rightRotate(a, n, size);
     rotate.printArray(a, size);
	
	    		}
}

