/*Compute the area of a triangle given the lengths of its three sides using Heron's formula.

The formula is as follows:
s = (a + b + c) / 2
A = sqrt(s * (s - a) * (s - b) * (s - c))
where:
a, b, and c are the lengths of the triangle's sides.
s is the semi perimeter (half of the perimeter) of the triangle.
A is the area of triangle*/
package Java_Programs;
import java.util.Scanner;
public class Herons 
{
public static void main(String[] args) 
  {
    try(Scanner sc = new Scanner(System.in);){
    System.out.print("Enter a: ");
    double a = sc.nextDouble();
    System.out.print("Enter b: ");
    double b = sc.nextDouble();
    System.out.print("Enter c: ");
    double c = sc.nextDouble();
    double semi_P =(a+b+c)/2; // semi perimeter
    double Area = Math.sqrt(semi_P * (semi_P - a) * (semi_P - b) * (semi_P - c)); // Area of triangle
    System.out.println("The Semi Perimeter is : "+semi_P); //printing semi perimeter
    System.out.println("The Area of Triangle is : "+Area); //printing area of triangle 
    }
  }
} 