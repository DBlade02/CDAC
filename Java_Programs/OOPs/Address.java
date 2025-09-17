/*Composition and Aggregation: Create a class Address with attributes street, city, and state. 
Then create a class Person with attributes name and an Address object. 
Demonstrate how to use com Write a Java class representing a Student. 
Encapsulate the student's name, age, and grade point average (GPA) with private access modifiers. 
Provide getter and setter methods to access and modify these attributes position to model the relationship 
between a person and their address*/

public class Address {
    private String street;
    private String city;
    private String state;
    private int pincode;

    public Address(String street, String city , String state , int pincode){
        this.street = street;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    void displayAddress(){
        System.out.println("Street: " + this.street);
        System.out.println("City: " + this.city);
        System.out.println("State: " + this.state);
        System.out.println("Pincode: " + this.pincode);
    }

    public static void main(String[] args) {
        Address addr = new Address("MG Road", "Pune", "Maharashtra", 411001);
        addr.displayAddress();
    }
}