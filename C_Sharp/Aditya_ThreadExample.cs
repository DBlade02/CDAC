using System;
using System.Threading;


namespace AdityaExamples
{
internal class Aditya_ThreadExample
{
static void Main()
{
Thread t = new Thread(() =>
{
for (int i = 1; i <= 5; i++)
{
Console.WriteLine($"[Worker] Aditya count: {i}");
Thread.Sleep(300);
}
});


t.Start();
for (int i = 1; i <= 3; i++)
{
Console.WriteLine($"[Main] Aditya main count: {i}");
Thread.Sleep(500);
}
t.Join();
}
}
}
