package collections;

import java.util.*;
public class LLDemo {
	public static void main(String[] args) {
		List<String> ll = new LinkedList();
		
		ll.add("Rohit");
		ll.add("Rahul");
		ll.add("Abhisekh");
		ll.add("Virat");
		ll.add("Sachin");
		ll.add("Dhoni");
		
		System.out.println(ll);
		ListIterator<String> litr = ll.listIterator();
		
		while(litr.hasNext()) {
			String name = litr.next();
			if(name.equals("Dhoni"))
				litr.remove();
			if(name.equals("Sachin"))
				litr.set("Shubhman");
		}
		Collections.sort(ll);
		System.out.println(ll);
	}
}
