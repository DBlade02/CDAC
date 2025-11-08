using System;


namespace AdityaExamples
{
delegate void Notify(string message);


internal class Aditya_DelegateExample
{
static void Main()
{
Notify n = Msg1;
n += Msg2; // multicast
n("Hello Aditya");
}


static void Msg1(string m) => Console.WriteLine("Msg1: " + m);
static void Msg2(string m) => Console.WriteLine("Msg2: " + m);
}
}
