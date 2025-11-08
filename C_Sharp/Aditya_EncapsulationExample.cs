using System;


namespace AdityaExamples
{
class BankAccount
{
private decimal balance;
public void Deposit(decimal amount)
{
if (amount > 0) balance += amount;
}
public decimal GetBalance() => balance;
}


internal class Aditya_EncapsulationExample
{
static void Main()
{
var acc = new BankAccount();
acc.Deposit(1000);
Console.WriteLine($"Aditya's account balance: {acc.GetBalance()}");
}
}
}
