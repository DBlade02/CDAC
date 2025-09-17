/* 2. Create a class Person with attributes name, age and country. 
Implement methods to set and get these attributes.
Create an object of this class, set its attributes, and print out the details.*/
public class Person {
    private String name;
    private int age;
    private String country;

    public void setData(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public void getData() { 
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
    }
    
    public static void main(String[] args) {
        Person person = new Person();
        person.setData("John Cena", 25, "USA");
        System.out.println("Person Details:");
        person.getData();
    }
}
