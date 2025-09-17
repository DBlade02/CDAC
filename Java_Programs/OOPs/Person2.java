/* 3. Constructor Overloading: Extend the Person class from the previous problem and add
multiple constructors (default, parameterized, etc.) to initialize the attributes. Also, include a
method to display the details. */

public class Person2 extends Person {

    public Person2() {
        // Default constructor
        setData("ADitya", 25, "India");
    }

    public Person2(String name, int age, String country) {
        // Parameterized constructor
        setData(name, age, country);
    }

    public Person2(String name) {
        // Constructor with only name
        setData(name, 0, "Unknown");
    }

    public Person2(int age) {
        // Constructor with only age
        setData("Unknown", age, "Unknown");
    }

    public Person2(String name, int age) {
        // Constructor with name and age
        setData(name, age, "Unknown");
    }

    public static void main(String[] args) {
        Person2 p1 = new Person2();
        System.out.println("Person 1 Details (Default Constructor):");
        p1.getData();

        System.out.println();

        Person2 p2 = new Person2("Jane Cena", 25, "Japan");
        System.out.println("Person 2 Details (Parameterized Constructor):");
        p2.getData();

        System.out.println();

        Person2 p3 = new Person2("Abhay");
        System.out.println("Person 3 Details (Name Only Constructor):");
        p3.getData();

        System.out.println();

        Person2 p4 = new Person2(28);
        System.out.println("Person 4 Details (Age Only Constructor):");
        p4.getData();

        System.out.println();

        Person2 p5 = new Person2("Damini", 22);
        System.out.println("Person 5 Details (Name and Age Constructor):");
        p5.getData();
    }
}
