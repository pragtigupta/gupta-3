package pac1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hello2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String str="tom";
		String str1="";
		for(int i=str.length()-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
		
		System.out.println(str1);
		//System.out.println(str1);
		*/
		
		
		//dupli char in a string
		String str="java";
		char[] arr=str.toCharArray();
		
		Map<Character, Integer>map=new HashMap<Character, Integer>();
		for(Character c:arr)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			 
			  
			}
			else
			{ 
				map.put(c, 1);
				
			}
		}
		
		
		
		Set<Map.Entry<Character, Integer>>set1=map.entrySet();
		
		for(Map.Entry<Character, Integer>mm:set1)
		{
			if(mm.getValue()>1)
			{
			     System.out.println( mm.getKey()+ " "+mm.getValue());			    
			}
		}	
		
		
		 
		

	}

}
