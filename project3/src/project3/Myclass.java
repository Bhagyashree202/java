package project3;

public class Myclass
{

	public static void main(String[] args) 
	{
		int[] data=new int[] {75,77,89,90,54};
		int index,i,j;
		for(i=0;i<data.length;i++)
		{
			index=i;
			for(j=i+1;j<data.length;j++)
			{
				if(data[j]<data[index])
					index=j;
				
			}
			int smallnumber=data[index];
			data[index]=data[i];
					data[i]=smallnumber;
			
		}
          for(i=0;i<data.length;i++)
        	  System.out.println(data[i]);
     }
	
}


