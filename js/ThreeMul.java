package js.js;

import java.util.Scanner;

public class ThreeMul {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("enter array size");
		 
		 int i=s.nextInt();
		 
		 int k[]= new int[i];
		 System.out.println("enter array values");

		 for(int j=0; j<i; j++) {
			 k[j]=s.nextInt();
		 }
		 int p=0;
		 for(int j=0; j<i; j++) {
			 p=k[j];
			 if((p%3)==0) {
				 System.out.println(p+" is dividible by 3");
			 }
		 }
		 
	}

}
