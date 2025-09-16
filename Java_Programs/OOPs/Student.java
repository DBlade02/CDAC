//Classes, Objects and Constructors
//1.	Define a class of type Student that has rollno, name and age as private data members. Define SetData() and GetData() as public member functions with appropriate functionality. Write a program that declares 2 student objects, initializes the first at run-time and second by reading from console, and then displays both student’s data.

public class Student {
    private int rollNo;
    private String name;
    private int age;

    public void SetData(int rollno, String name, int age) {
        this.rollNo = rollno;
        this.name = name;
        this.age = age;
    }

    public void GetData(){
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}
