/* 2. Define a base class Person and a derived class employee with single inheritance. 
Define SetData() member functions in each of the class with different signatures to set the data
members and demonstrate overloading of member functions. 
Define GetData() member functions in each of the class with same signatures to display data and demonstrate overriding of member functions. */

class Person {
    protected String name;
    protected int age;

    public void SetData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void GetData() {
        System.out.println("Person Name: " + name);
        System.out.println("Person Age: " + age);
    }
}

class Employee extends Person {
    private int employeeId;
    private String department;

    
    public void SetData(String name, int age, int employeeId, String department) {
        
        super.SetData(name, age);
        this.employeeId = employeeId;
        this.department = department;
    }

    @Override
    public void GetData() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        
        Person person = new Person();
        person.SetData("Aditya Mogre", 25);
        System.out.println("---- Person Data ----");
        person.GetData();

        System.out.println();

        Employee employee = new Employee();
        employee.SetData("Aditya Vijay Mogre", 22, 101, "Computer Engineering");
        System.out.println("---- Employee Data ----");
        employee.GetData();
    }
}
