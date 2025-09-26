package Strings;

import java.util.*;

public class Comparabledemo {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(81,"Satwik"));
		list.add(new Student(14,"Ganesh"));
		list.add(new Student(44,"Sujala"));
		list.add(new Student(13,"Bhavy"));
		list.add(new Student(45,"Faiz"));
		
		System.out.println(list);
//		Collections.sort(list);
//		System.out.println(list);
		Collections.sort(list, new SortByName());
		System.out.println(list);
		
	}
	
		
}
