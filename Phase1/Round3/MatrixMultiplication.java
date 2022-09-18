package project3;
import java.util.Scanner;
class multi{
void Multiplication(int a[][],int b[][],int c[][],int row1,int col1,int row2,int col2)
{  
	for (int i = 0; i < row1; i++) 
    {
        for (int j = 0; j < col2; j++) 
        {
        	c[i][j]=0;
            for (int k = 0; k < col1; k++) 
	
           {
              c[i][j]+= a[i][k]*b[k][j];
           }
        }
     }
     System.out.println("Matrix after multiplication:");
     for (int i = 0; i < row1; i++) 
     {
         for (int j = 0; j < col2; j++) 
         {
             System.out.print(c[i][j]+" ");
         }
         System.out.println("");
     }
  }
}
public class MatrixMultiplication {
public static void main(String[] args) {
	multi m=new multi();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the row size");
	int row1=sc.nextInt();
	System.out.println("enter the column size");
	int col1=sc.nextInt();
	System.out.println("enter the row size");
	int row2=sc.nextInt();
	System.out.println("enter the column size");
	int col2=sc.nextInt();
	int a[][]=new int[row1][col1];
	int b[][]=new int[row2][col2];
	int c[][]=new int[row1][col2];
	if((row1==col2)||(col1==row2)) {
	System.out.println("enter the 1st array element");
	  for (int i = 0; i < row1; i++) 
	     {
	         for (int j = 0; j < col2; j++) 
	         {
	             a[i][j]=sc.nextInt();
	         }
	     }
		System.out.println("enter the 2nd array element");
		  for (int i = 0; i < row2; i++) 
		     {
		         for (int j = 0; j < col2; j++) 
		         {
		             b[i][j]=sc.nextInt();
		         }}
		  
		m.Multiplication(a, b, c,row1,col1,row2,col2);

	}
	else
		System.out.println("matrix multiplication is not possible");
	
}}

