/*Compute the area of a triangle given the lengths of its three sides using Heron's formula.

The formula is as follows:
s = (a + b + c) / 2
A = sqrt(s * (s - a) * (s - b) * (s - c))
where:
a, b, and c are the lengths of the triangle's sides.
s is the semi perimeter (half of the perimeter) of the triangle.
A is the area of triangle*/
public class Herons {
  public static void main(String[] args) {
    double a =10, b=11, c=15; // lengths of the sides of triangle
    double semi_P =(a+b+c)/2; // semi perimeter
    double Area = Math.sqrt(semi_P * (semi_P - a) * (semi_P - b) * (semi_P - c)); // Area of triangle
    System.out.println("The s is : "+semi_P); //printing semi perimeter
    System.out.println("The A is : "+Area); //printing area of triangle 
  }
}