//Write a program that declares 2 student objects, initializes the first at run-time and second by reading from console, and then displays both student’s data.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student1 = new Student();// student 1 data
        student1.SetData(1, "Alice", 20);
        System.out.println("Student 1 Details:");
        student1.GetData();

        System.out.println(); 

        System.out.println("Enter details for Student 2:");

        System.out.print("Roll No: ");
        int rollNo = sc.nextInt();

        System.out.print("Name: ");
        String name = sc.next();

        System.out.print("Age: ");
        int age = sc.nextInt();

        System.out.println(" ");

        Student student2 = new Student(); // student 2 data
        student2.SetData(rollNo, name, age);
        System.out.println("Student 2 Details:");
        student2.GetData();
        sc.close();

    }
}
