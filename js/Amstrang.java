package js.js;

import java.util.Scanner;

public class Amstrang {
	public static void main(String args[]){

	Scanner s=new Scanner(System.in);
	System.out.println("enter a number to check amstrong num  are not");
	/** int i=s.nextInt();
	int c=0,b ,a;
	 b=i;
	 if(i>0) {
		  a=i%10;  
		    i=i/10;  
		    c=c+(a*a*a);  
		    }  
		    if(b==c)  {
		    System.out.println("armstrong number");   }
		    else  {
		        System.out.println("Not armstrong number");   
		   }  
	 */
	String n=s.nextLine();
	int l=n.length();
   String sp[]=n.split("");
   int k;
   int c=0;

   for(int j=0;j<n.length();j++) {
       k=Integer.parseInt(sp[j]);
       k=(int) Math.pow(k, l); 
       c=k+c;
             }
   int k1=Integer.parseInt(n);

       if(c==k1) {
    	   System.out.println(k1+"is amstring num");
       }else {
	   System.out.println(k1+"is notamstring num hello");
       }
	}
}
