/*Composition and Aggregation: Create a class Address with attributes street, city, and state. 
Then create a class Person with attributes name and an Address object. 
Demonstrate how to use com Write a Java class representing a Student. 
Encapsulate the student's name, age, and grade point average (GPA) with private access modifiers. 
Provide getter and setter methods to access and modify these attributes position to model the relationship 
between a person and their address*/

class AddressDemo{
    String street, city, state;

    AddressDemo(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public void displayAddress() {
        System.out.println(street + ", " + city + ", " + state);
    }
}

class PersonWithAddress {
    String name;
    AddressDemo address;

    PersonWithAddress(String name, AddressDemo address) {
        this.name = name;
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + name);
        address.displayAddress();
    }
}

public class Address1{
    public static void main(String[] args) {
        AddressDemo Addr = new AddressDemo("123 Main St", "Chandrapur", "Maharashtra");
        PersonWithAddress person = new PersonWithAddress("Aditya", Addr);
        person.display();
    }
}
