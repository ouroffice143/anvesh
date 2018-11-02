package js.js;

import java.util.Scanner;

public class Matrix {
	public static void main(String arg[])
	{
	     Scanner s=new Scanner(System.in);
	     System.out.print("enter size of row : ");
	     int r=s.nextInt();
	     System.out.print("enter size of colun : ");
	     int c=s.nextInt();
	     int a[][]=new int[r][c];
	     int a1[][]=new int[r][c];
          int p=0;
	     System.out.print("enter the elements of first matrix : ");
	     for(int i=0;i<r;i++)
	   {
	     for(int j=0;j<c;j++)
	   {
	     a[i][j]=s.nextInt();
	   }
	   }
	     System.out.print("enter the elements of first2 matrix : ");
	     for(int i=0;i<r;i++)
	   {
	     for(int j=0;j<c;j++)
	   {
	     a1[i][j]=s.nextInt();
	   }
	     
	   }
	   System.out.println("after addition of 2 matrix");
	     for(int i=0;i<r;i++)
		   {
		     for(int j=0;j<c;j++)
		   {
			   p=a[i][j]+ a1[i][j];
			     System.out.print( p);


		   }
		   }
		   
	   

	}
}
