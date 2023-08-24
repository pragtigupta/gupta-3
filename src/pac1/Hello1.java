package pac1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hello1 {

	public static void main(String[] args) {
		System.out.println("llrrr");
		
		/*
		String str="InterviewProcess";
		
		char[] arr=str.toCharArray();
		
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		
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
				for(Map.Entry<Character, Integer> mp1:set1)
				{
					if(mp1.getValue()==1)
					
					{
						System.out.println(mp1.getKey()+ " "+mp1.getValue());
					}
				}
		
		*/		
		
		
		/*
		Print 1 to 50 number
		if the number diveded by 3 print A
		if the number diveded by 5 print B
		if the number diveded by 3 & 5 print AB
		*/
		
		
		for(int i=1;i<51;i++);
		{
			int i=0;
			if(i%3==0)
			{
				System.out.println("A");
			}
			else if(i%5==0)
			{
				System.out.println("B");
			}
			else 
			{
				
				if(i%3==0 && i%5==0)
				{
					System.out.println("AB");
				}
				
			}
			
		}
		

	}

}
