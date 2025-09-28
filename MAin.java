//package Assignment_11;
class Human{
    private String name;
    private int age;

    Human(String name,int age){
        this.name= name;
        this.age = age;
    }

    public void setName(String n){
        name = n;
    }
    public  String getName(){
        return name;
    }

    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }
}


public class MAin {
    public static void main(String[] args) {
        Human h1 = new Human("ADitya", 25);
        System.out.println(h1.getName());
        System.out.println(h1.getAge());

        
    }
}


