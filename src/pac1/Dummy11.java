package pac1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dummy11 {

	public static void main(String[] args) {
		
		System.out.println("ll");
		// TODO Auto-generated method stub
		/*
		 String s1 = " This is an interview. How are you doing? This is an interview for Pragti.";
	        
	        // This 2
	        // is 2
	        // an 2
	        // interview 2
	         	        
	        String[]arr=s1.split(" ");
	        
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
	        
	        
	        for(Map.Entry<String, Integer> m1:set1)
	        {
	        	if(m1.getValue()>1)
	        	{
	        		System.out.println(m1.getKey()+ " "+m1.getValue());
	        	}
	        }
	        */
	        /*
	        
	        String s = "abaaabaaabaa";
	        //[0,10], [5,8], [2,5]
	        
	     vector <vector <int> > queries = {{0,10}, {5,8}, {2,5}};
	               
	        
	        
	        String srrr=s.substring(5, 8);
	        
	       // String srrr1
	        
	        for(int i=srrr.length()-1;i>=0;i--)
	        {
	            
	            
	        }
	        */
	        
	        //position not changed     
	        
	        
		
		int[] arr= {5, 8,9, 20, 2};
		
		int temp;
		
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					//arr[j]=arr[j+]
				}
			}
		}          
	 
	        
	        
	        
	        
	        
	        
	        

	}

}
