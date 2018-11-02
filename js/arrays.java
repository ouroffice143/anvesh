package js.js;

import java.util.Scanner;

public class arrays {
	
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter array size");
 
 int i=s.nextInt();
 
 int k[]= new int[i];
 System.out.println("enter array values");

 for(int j=0; j<i; j++) {
	 k[j]=s.nextInt();
 }
 int o=i-1;
 for(int j=o; j>=0; j--) {
	 System.out.println( "printing arrys in from upper location to lower"+k[j]);
	 
 }
 }

}


