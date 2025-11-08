using System;


namespace AdityaExamples
{
// Generic delegate example
delegate T Transformer<T>(T value);


internal class Aditya_GenericDelegateExample
{
static void Main()
{
Transformer<int> square = x => x * x;
Console.WriteLine($"Aditya: square of 5 is {square(5)}");
}
}
}
