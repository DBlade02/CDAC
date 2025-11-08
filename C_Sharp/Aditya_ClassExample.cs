using System;


namespace AdityaExamples
{
class Student
{
public string Name { get; set; }
public int Age { get; set; }


public void Print() => Console.WriteLine($"Student Name: {Name}, Age: {Age}");
}


internal class Aditya_ClassExample
{
static void Main()
{
var s = new Student { Name = "Aditya", Age = 23 };
s.Print();
}
}
}
