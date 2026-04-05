//Encapsulation practice
class student{
    private String name;        //private variables
    private int age;
    //getters
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        //Accessing the data
        student s = new  student();
        s.setName("Aditya Mogre");
        s.setAge(23);

        System.out.println("The name is "+s.getName());
        System.out.println("The Age of the person is "+s.getAge());
    } 
}
