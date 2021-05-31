package com.Patterns;
import java.util.Scanner;
public class Pattern1 
{
    public static void main(String []args)
    {
    	Scanner s = new Scanner(System.in);
    	int r=7,c=25;
    	System.out.println("Enter name");
    	String name = s.nextLine();
    	for(int i=1;i<=r;i++)
    	{
    		for(int j=1;j<=c;j++)
    		{
    			if((i==1 && j==1)||(i==1 && j==c)||(i==r && j==1)||(i==r && j==c))
    			{
    				System.out.print("+");
    			}
    			else if(i==1||i==r)
    			{
    				System.out.print("-");
    			}
    			else if(j==1||j==c)
    			{
    				System.out.print("|");
    			}
    			else if(i==r-2 && j==c-(name.length()+2))
    			{
    				System.out.print(name);
    				j=j+name.length()-1;
    			}
    			else
    			{
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    	
    }
}

