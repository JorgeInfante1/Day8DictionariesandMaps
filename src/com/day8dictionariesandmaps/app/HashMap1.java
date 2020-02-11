package com.day8dictionariesandmaps.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap1
{

	public static void main(String[] args) 
	{
		//Variable Declaration
		int n = 3;
		String name = null;
				
		Scanner input = new Scanner(System.in);
		// HashMap Declaration
		Map<String, Integer> phoneBook = new HashMap<String, Integer>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Input a name");
			 name = input.next();
			System.out.println("Input a Phone Number");
			int phone = input.nextInt();
			
			phoneBook.put(name, phone);
		}
		System.out.println(phoneBook);
		/*phoneBook.put("Sam", 99912222);
		phoneBook.put("Tom", 11122222);
		phoneBook.put("Harry", 12299933);*/
		
		//System.out.println(phoneBook.toString());
		while(input.hasNext())
		{
			String s = name;
			if(phoneBook.containsKey(s))
            {
                System.out.println(s+"="+phoneBook.get(s));
            }
            else
            {
                System.out.println("Not found");
            }
		/*System.out.println("Sam="+phoneBook.get("Sam"));
		if(phoneBook.containsKey("Juan"))
		{
			System.out.println(phoneBook.get("Juan"));
		
		}
		else 
		{
			System.out.println("Not Found");
		}
		System.out.println("Harry="+phoneBook.get("Harry"));*/
		
		}
		
		
	}

}
