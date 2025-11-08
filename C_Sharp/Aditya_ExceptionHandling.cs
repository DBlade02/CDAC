namespace AdityaExamples
{
internal class Aditya_ExceptionHandling
{
static void Main()
{
try
{
int x = 10, y = 0;
Console.WriteLine(x / y);
}
catch (DivideByZeroException)
{
Console.WriteLine("Cannot divide by zero — message for Aditya");
}
}
}
}
