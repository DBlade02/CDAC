using System;


namespace AdityaExamples
{
interface IShape { double Area(); }
class Circle : IShape { public double Radius; public Circle(double r) { Radius = r; } public double Area() => Math.PI * Radius * Radius; }


internal class Aditya_PolymorphismExample
{
static void Main()
{
IShape s = new Circle(3);
Console.WriteLine($"Area for Aditya's circle: {s.Area():F2}");
}
}
}
