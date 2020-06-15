package org.umar.LearnLists;
import java.util.*;

public class LinkedLists
{
	public static void main(String args[])
	{
		LinkedList<String> list=new LinkedList<String>();
		
	    list.add("umar");
	    list.add("ram");
	    list.add("jayesh");

     
	    list.addFirst("ram");
	    
	    Iterator<String> iterator=list.iterator();
	    
	    while(iterator.hasNext())
	    {
	    	System.out.println(iterator.next());
	    }
	} 
} 