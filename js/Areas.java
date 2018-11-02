package js.js;

import java.util.Scanner;

public class Areas {

	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("enter radies of circle");
				 float i=s.nextFloat();
				 double k=3.14;
				 
				 double area=k*(i*i);
				 double cir=2*k*i;
				 
				 
					System.out.println("enter base value of a triangle");
					 float b=s.nextFloat();
						System.out.println("enter hight  value of a triangle");
						 float h=s.nextFloat();
						
						 System.out.println("enter side1 value of a triangle");
						 float si1=s.nextFloat();

						 System.out.println("enter side2 value of a triangle");
						 float si2=s.nextFloat();

						 double ta=(b*h)/2;
						 double pa= b+si1+si2;
						 
						 System.out.println("area of triangle "+ta);
						 System.out.println("perimeter of triangle "+pa);

						 System.out.println("area of circle "+area);
						 System.out.println("circurfanse of circle "+cir);

}
}