package org.umar.learnSets;
import java.util.HashSet;

public class HashSets
{
	public static void main(String args[])
	{
		HashSet<String> hset = new HashSet<String>();
		
		hset.add("Apple");
	    hset.add("Mango");
	    hset.add("Grapes");
	    hset.add("Orange");
	     
	
	    hset.add("Apple");
	    hset.add("Mango");
	
	    System.out.println(hset);
    }
}