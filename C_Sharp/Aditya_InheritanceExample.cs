using System;


namespace AdityaExamples
{
class Animal { public virtual void Speak() => Console.WriteLine("Animal speaks"); }
class Dog : Animal { public override void Speak() => Console.WriteLine("Dog barks — Aditya's dog"); }


internal class Aditya_InheritanceExample
{
static void Main()
{
Animal a = new Dog();
a.Speak();
}
}
}
