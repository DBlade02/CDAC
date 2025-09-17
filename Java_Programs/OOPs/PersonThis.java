/*Using this: Modify the Person class to include a method that displays the name and age
of the object. 
Use this keyword to differentiate between class variables and method parameters.
Implement a method to compare two Person objects based on their age.*/

public class PersonThis {
    private String name;
    private int age;

    
    public PersonThis(String name, int age){
        this.name = name ;
        this.age = age;
    }

    public void display(){
        System.out.print(name);
        System.out.print(age);

    }

    public boolean isOlderThan(PersonThis other){
        return this.age > other.age;
    }

    
    public static void main(String[] args){
        PersonThis p1 = new PersonThis("AdityA ", 23);
        p1.display();   
            System.out.println();
        PersonThis p2 = new PersonThis("Abhay ", 25);    
        p2.display();
            System.out.println();
        if(p1.isOlderThan(p2)){
            System.out.println("p1 is older than p2");
        }
        else{
            System.out.println("p2 is older than p1");
        }
    }
}
    



