/*5. Create a class with a method that prints "This is parent class" and its subclass with another
method that prints "This is child class". Now, create an object for each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class */

class Parent {
    public void printParentClass() {
        System.out.println("This is parent class");
    }
    
    public void printMessage(String message) {
        System.out.println(message);
    }
}

class Child extends Parent {
    public void printChildClass() {
        System.out.println("This is child class");
    }
    
    public void printCustomMessage() {
        System.out.println("This is a custom message from child class");
    }
}

public class Problem5 {
    public static void main(String[] args) {
        Parent parentObj = new Parent();
        Child childObj = new Child();

        System.out.println();
        
        parentObj.printParentClass();
        parentObj.printMessage("Hello from parent class");

        System.out.println();
        
        childObj.printChildClass();
        childObj.printCustomMessage();

        System.out.println();
        
        childObj.printParentClass();
        childObj.printMessage("Hello from child class");
    }
}