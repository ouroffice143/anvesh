package js.js;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("enter array size");
		
		 int temp=0;
		 int i=s.nextInt();
		 
		 int k[]= new int[i];
		 System.out.println("enter array values");

		 for(int j=0; j<i; j++) {
			 k[j]=s.nextInt();
		 }
		 for(int j=0; j<i; j++) {
			 
				 for(int j1=0; j1<i; j1++) {
				 if(k[j]<k[j1]) {
					temp=k[j];
					k[j]=k[j1];
					k[j1]=temp;
					 
				 }
				 }
				 }
		 System.out.print("Ascending Order:");
	        for (int j = 0; j < i; j++) 
	        {
	            System.out.print(k[j] + ",");
	        }
			 System.out.println(" ");

		 for(int j=0; j<i; j++) {
		 if(k[j]%2!=0) {
			 System.out.print(k[j]+" ");
		 } 
		 }
		 
		 
		 for(int j=i-1; j>=0; j--) {
			 if(k[j]%2==0) {
				 System.out.print(" "+k[j]);
			 } 
		 }
		 }
	
}
