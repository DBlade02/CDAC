/*6. Create a class named 'Member' having the following members:
Data members: 1 – Name, 2 – Age, 3 - Phone number, 4 – Address, 5 - Salary
It also has a method named 'printSalary' which prints the salary of the members. 
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes
have data members'specialization' and 'department' respectively. Now, assign name, age,
phone number, address and salary to an employee and a manager by making an object of both
of these classes and print the same. */

class Member {
    private String name;
    private int age;
    private long number;
    private String address;
    private double salary;

    public Member(String name, int age, long number, String address, double salary) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary of " + name + " is " + salary);
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + number);
        System.out.println("Address: " + address);
        printSalary();
    }
}

class Employee extends Member {
    private String specialization;
    private String department;

    public Employee(String name, int age, long number, String address, double salary, String specialization, String department) {
        super(name, age, number, address, salary);
        this.specialization = specialization;
        this.department = department;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Specialization: " + specialization);
        System.out.println("Department: " + department);
        System.out.println();
    }
}

class Manager extends Member {
    private String specialization;
    private String department;

    public Manager(String name, int age, long number, String address, double salary, String specialization, String department) {
        super(name, age, number, address, salary);
        this.specialization = specialization;
        this.department = department;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Specialization: " + specialization);
        System.out.println("Department: " + department);
        System.out.println();
    }
}

class Main2 {
    public static void main(String[] args) {
        Employee employee = new Employee("Avantika", 23, 1234567890L, "Pune", 50000.0, "Software Engineer", "Computer Engineering");
        Manager manager = new Manager("Aditya Vijay Mogre", 24, 123456789L, "Hyderabad", 75000.0, "Project Management", "IT Department");

        System.out.println("Employee Details:");
        employee.printDetails();

        System.out.println("Manager Details:");
        manager.printDetails();
    }
}
 