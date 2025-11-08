using System;


namespace AdityaExamples
{
interface IService { void Serve(); }
class MyService : IService { public void Serve() => Console.WriteLine("Service serving Aditya"); }


class Consumer
{
private readonly IService _svc;
public Consumer(IService svc) { _svc = svc; }
public void Start() => _svc.Serve();
}


internal class Aditya_DI_Simplified
{
static void Main()
{
// Manual DI: create dependency and pass it in
IService svc = new MyService();
var consumer = new Consumer(svc);
consumer.Start();
}
}
}
