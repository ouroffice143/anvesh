package js.js;

import java.util.Scanner;

public class Primenum {
	
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter  aumber to check prime or not");
 
 int i=s.nextInt();
 int p;
boolean count=true;
for(int k=2 ;k<=i/2 ;k++)
{
	p=i%k;
	if(p==0) {
		count=false;
		
		break;
	}

}
if(count) {
	
	System.out.println(i+" is prime number");
}else {
System.out.println(i+" is notprime number");
}


}


}
