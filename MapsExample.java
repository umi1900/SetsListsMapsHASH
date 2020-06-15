package org.umar.learnMaps;

import java.util.HashMap;

public class MapsExample
{
	public static void main(String args[]) 
	{
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(5, "umar");
		hmap.put(2, "Ram");
		hmap.put(7, "Jayesh");
		hmap.put(49, "Test");
      
		System.out.println(hmap);
		
		

	}
}