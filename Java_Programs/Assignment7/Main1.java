//3. Write a program to give example for multilevel inheritance in Java.

class A {

    A(A a, int b) {
    }

    public void eat() {
        System.out.println("Animal is eating");
    }
}

class B extends A {

    B() {
        super(a, b);
    }

    public void walk() {
        System.out.println("Mammal is walking");
    }
}

class C extends B {

    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class Main1 {
    public static void main(String[] args) {
        C myDog = new C();

        myDog.eat();
        myDog.walk();
        myDog.bark();
    }
}
