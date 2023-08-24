package pac1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		/*
		int[] arr= {4,8, 3,2, 0};
		
		int temp;
		
		
for(int i=0;i<arr.length-1;i++)
{
	for(int j=0;j<arr.length-1;j++)
	{
		
		if(arr[j]>arr[j+1])
		{
			temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;			
			
		}	
		
		
	}
}
		
		for(int i:arr)
		{
			System.out.println(i);
		}
		
		*/
		
		
		/*
		
	String str="madam";
	
	String str1="";
	
	for(int i=str.length()-1;i>=0;i--)
	{
		str1=str1+str.charAt(i);
		
	}	
	
	if(str.equals(str1))
	{
		System.out.println("p");
		
	}
	else
	{
		System.out.println("nt p");
			
	}
	
	*/
		
	/*
		
		//anagram:		
		String str="silent";
		String str1="lisent";
		
		if(str.length()==str1.length())
		{
			
			char[] arr=str.toCharArray();
			char[] arr1=str1.toCharArray();
			
			Arrays.sort(arr);
			Arrays.sort(arr1);
			
		        if(Arrays.equals(arr, arr1))
				{
		        	System.out.println("ana");			
		        
				}
		        else
		        {
		        	System.out.println("not ana");
		        }
			
			
			
		}
		*/
		
		
		//duplicate words in a string		
		
		String str="java is is java lang";		
		String[] arr=str.split(" ");	
		
		
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		for(String s:arr)
		{
			if(map.containsKey(s))
			{
				map.put(s, map.get(s)+1);			
			}
			else
			{
				map.put(s, 1);
			}
			
		}
		
		
		Set<Map.Entry<String, Integer>>set1=map.entrySet();
		
		for(Map.Entry<String, Integer> mm:set1)
		{
				
			if(mm.getValue()>1)
			{				
				System.out.println(mm.getKey()+ " "+mm.getValue());
			}	
			
			
		}
		
		
		//fibbonica, prime, swapping
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
					

		
	
		
		
		
		

	}

}
