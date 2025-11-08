using System;


namespace AdityaExamples
{
interface ILogger { void Log(string msg); }
class ConsoleLogger : ILogger { public void Log(string msg) => Console.WriteLine($"Aditya Log: {msg}"); }


internal class Aditya_InterfaceExample
{
static void Main()
{
ILogger log = new ConsoleLogger();
log.Log("This message is for Aditya");
}
}
}
