package js.js;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix2 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter first matrix  row size");
		int r=Integer.parseInt(br.readLine());
		
		System.out.println("enter first matrix colum size");
        int c=Integer.parseInt(br.readLine());
        
        int m[][]=new int[r][c];
        
      
        
        System.out.println("enter second matrix  row ");
		int r1=Integer.parseInt(br.readLine());
		
		System.out.println("enter second matrix colum size");
        int c1=Integer.parseInt(br.readLine());
        
        int b[][]=new int[r1][c1];
        if(c==r1) {
        	
        	  System.out.print("enter values for first matrix");
              for(int i=0;i<r;i++) 
              {
              	for(int j=0;j<c;j++)
              	{
              	m[i][j]=Integer.parseInt(br.readLine());	
              	}
              	
              }
        System.out.print("enter values for second matrix");
        for(int i=0;i<r1;i++) 
        {
        	for(int j=0;j<c1;j++)
        	{
        	b[i][j]=Integer.parseInt(br.readLine());	
        	}
        	
        }
        
        int d[][]=new int[r][c1];
        for(int i=0;i<r;i++)
        {
        	for(int j=0;j<c1;j++)
        	{
        		for(int k=0;k<c;k++)
        		{
        		d[i][j]=d[i][j]+m[i][k]*b[k][j];
        		
        		
        		}
        		System.out.print(d[i][j]+" ");
        		System.out.println();
        	}
        }
        
        
        }else{
        	System.out.println("we can not perform matrix multipation because first matrix col not match with second matrix row");
        }
	}
        



}
