package Strings;

import java.util.*;
import java.util.List;

public class Examplestrings {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		
//		for(int i : list) {
//			System.out.println(i);
//		}
//		System.out.println(list);
//		System.out.println(list.get(2));
		
		LinkedList<String> ll = new LinkedList<>();
		
		ll.add("DAC");
		ll.add("DBDA");
		ll.add("DESD");
		
//		System.out.println(ll);
//		System.out.println(ll.get(2));
		Stack<String> names = new Stack<>();
		names.push("Nilesh");
		names.push("Ramcharan");
		names.push("Lufi");
		names.push("Pushparaj");
		names.push("Kuldeep");
		
		System.out.println(names.isEmpty());
		System.out.println(names.peek());
		names.pop();
		System.out.println(names.peek());
		
		
		
		
		
		
		
		
		
		

	}

}
