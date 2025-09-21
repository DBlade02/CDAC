/*Problem 4: Task: Create an interface Animal with methods makeSound() and eat().
Implement this interface in two classes Dog and Cat. */

interface Animal1{
    public void Sound();
    public void Eat();
}

class Dog implements Animal1{
    public void Sound(){
        System.out.println("Dog is Barkings");
    }
    public void Eat(){
        System.out.println("Dog is Eating");
    }
}

class Cat implements Animal1{
    public void Sound(){
        System.out.println("Cat Meows");
    }
    public void Eat(){
        System.out.println("Cat Eats");
    }
}

public class Main4{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.Sound();
        dog.Eat();
        System.out.println();
        Cat cat = new Cat();
        cat.Sound();
        cat.Eat();
    }
}