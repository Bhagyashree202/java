package project2;

import java.util.Arrays;
import java.util.List;

public class Myclass {

	public static void main(String[] args)
	{
		List<Integer>data=Arrays.asList(15,25,35,40,55,99);
		int SearchElement=35;
		int low,high,mid;
	    high=data.size();
	    low=0;
	    mid=(high+low)/2;
	    while(true)
	    {
	    System.out.println("mid:"+mid);
	    
	    if(SearchElement==data.get(mid))
	    {
	    System.out.println("found at:"+mid);
	    break;
	    }
	    
	    if(SearchElement>data.get(mid))
	    	low=mid;
	    else
	    	high=mid;
	    mid=(low+high)/2;
	    
	    }
	}


	}


