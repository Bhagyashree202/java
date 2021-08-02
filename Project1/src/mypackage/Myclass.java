package mypackage;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Myclass
{

	public static void main(String[] args) 
	{
		List<Integer>data=Arrays.asList(12,25,30,45,50,95);
		int searchElement,loc=0;
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter search element");
		searchElement=obj.nextInt();
		for(int d:data)
		{
			if(d==searchElement)
			{
				System.out.println("Element found at"+loc);
				break;
			}
			loc++;
		}
		if(loc==data.size())
			System.out.println("Element not found");
		}
   }


