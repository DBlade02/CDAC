using System;
using System.Collections.Generic;


namespace AdityaExamples
{
internal class Aditya_ListExample
{
static void Main()
{
var numbers = new List<int> { 10, 20, 30 };
numbers.Add(40);
Console.WriteLine("Numbers for Aditya:");
numbers.ForEach(n => Console.WriteLine(n));
}
}
}
