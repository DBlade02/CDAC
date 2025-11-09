using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Csharp
{
    using System;

    public abstract class BankAccount
    {
        // Abstract method — only declared here
        public abstract void OpenAccount(string name);

        // Normal method — common for all accounts
        public void AccountOpened(string name)
        {
            OpenAccount(name);
            Console.WriteLine("Account opened successfully for " + name);
        }
    }

    public class SavingsAccount : BankAccount
    {
        // Implementing (overriding) the abstract method
        public override void OpenAccount(string name)
        {
            Console.WriteLine("Creating a savings account for " + name);
        }

        public void ShowBalance()
        {
            Console.WriteLine("Your current balance is ₹10,000");
        }
    }

    class Program
    {
        static void Main()
        {
            Console.Write("Enter your name: ");
            string name = Console.ReadLine();

            SavingsAccount acc = new SavingsAccount();
            acc.AccountOpened(name); // calls both OpenAccount and AccountOpened
            acc.ShowBalance();       // shows extra feature of SavingsAccount

            Console.ReadLine();
        }
    }

}
