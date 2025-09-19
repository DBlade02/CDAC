/*Demonstrate calling the constructor of the base class from the constructor of the derived class. 
Create objects of person and employee classes to show the order of invocation of constructors. */

class Person {

    public String name;

    public Person() {
        System.out.println("Person's default constructor .");
        this.name = "AAABBBCCC";
    }

    public Person(String name) {
        System.out.println("Person's parameterized constructor name: " + name);
        this.name = name;
    }
}

class Employee extends Person {

    int employeeId;

    public Employee() {

        System.out.println("Employee's default constructor .");
        this.employeeId = 2580;
    }

    public Employee(String name, int employeeId) {
        super(name);
        System.out.println("Employee's parameterized constructor ID: " + employeeId);
        this.employeeId = employeeId;
    }
}

public class ConstructorInvocationDemo {

    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println("Person name: " + person1.name);
        System.out.println();

        Employee employee1 = new Employee();
        System.out.println("Employee name: " + employee1.name + ", ID: " + employee1.employeeId);
        System.out.println();

        Employee employee2 = new Employee("Aditya Mogre", 214);
        System.out.println("Employee name: " + employee2.name + ", ID: " + employee2.employeeId);
    }
}


