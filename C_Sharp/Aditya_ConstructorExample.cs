using System;


namespace AdityaExamples
{
class Person
{
public string Name { get; }
public Person(string name) { Name = name; }
}


internal class Aditya_ConstructorExample
{
static void Main()
{
var p = new Person("Aditya");
Console.WriteLine($"Constructed person: {p.Name}");
}
}
}
