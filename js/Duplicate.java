package js.js;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicate {

	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("enter array size");
		 
		 int i=s.nextInt();
		 
		 int k[]= new int[i];
		 System.out.println("enter array values");

		 for(int j=0; j<i; j++) {
			 k[j]=s.nextInt();
		 }
		 int count=1;
		 
		 for(int m=0 ; m<i; m++) {
			count=1; 
		 for( int n=m+1 ;n<i; n++) {
				 
				 if(k[m]==k[n] ) {
					 count++;
					 k[n]=0;
					 }
				 			 }
								 
			 if(count>1&&k[m]!=0) {
			 System.out.println(k[m]+" repeat " +count);
		               }
		 }
		  
		
	}
}
