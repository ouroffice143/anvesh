package js.js;

import java.util.Scanner;

public class Triangle {

	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("enter array size");
	
	 int n=s.nextInt();
	 for (int i=1; i<=n; i++) 
     {  

	  for (int j=n-i; j>=1; j--) 
      { 
         
          System.out.print(" "); 
      } 

      for (int j=1; j<=i; j++ ) 
      { 
        
          System.out.print(i+" ");
         
      } 

      System.out.println("hello how are you"); 
  } 
} 
	 

}
