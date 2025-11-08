using System;
using System.Threading.Tasks;


namespace AdityaExamples
{
internal class Aditya_AsyncAwait
{
static async Task Main()
{
Console.WriteLine("Starting async task for Aditya...");
var result = await DoWorkAsync();
Console.WriteLine($"Async result: {result}");
}


static async Task<string> DoWorkAsync()
{
await Task.Delay(500);
return "Done for Aditya";
}
}
}
