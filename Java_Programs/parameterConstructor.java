/*Basic Package Creation and Usage
Task: Create a package named com.example.math and add a class Calculator with methods for addition and subtraction. 
Then, create another class MathTest in the com.example.test package to use the Calculator class
*/
class AgeAndName {
  int age;
  String name;

  public AgeAndName(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public void display() {
    System.out.println("Age: " + age);
    System.out.println("Name: " + name);
  }
}

class parameterConstructor {
  public static void main(String[] args) {
    AgeAndName obj = new AgeAndName(20, "John");
    obj.display();

  }
}
