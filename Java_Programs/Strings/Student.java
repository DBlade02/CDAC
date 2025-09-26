package Strings;

import java.util.Comparator;

public class Student{
	int roll;
	String name;
	
	Student(int roll,String name){
		this.roll = roll;
		this.name = name;
	}
//	@Override
//	public int compareTo(Student other) {
//		return this.roll - other.roll;
//	}
	
	@Override
	public String toString() {
		return roll + " : " + name;
	}
}
class SortByName implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
		return s1.name.compareTo(s2.name);
	}
}

