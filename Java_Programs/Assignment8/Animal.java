/*Create an abstract class Animal with an abstract method void sound().
Then, create three subclasses, Dog, Cat, and Cow, each implementing the sound
method with their respective sounds. Write a main method to create instances of Dog,
Cat, and Cow, and invoke the sound method on each instance.*/

abstract class Animal {
    abstract void Sound();
}

class Dog extends Animal{
    void Sound(){
        System.out.println("Bark Bark");
    }
}
class Cat extends Animal{
    void Sound(){
        System.out.println("Meow Meow");
    }
}
class Cow extends Animal{
    void Sound(){
        System.out.println("Moo Moo");
    }
}