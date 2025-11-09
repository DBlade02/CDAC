using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Csharp
{
    internal class Explicit_Inteface
    {
        interface IFirst
        { 
            void AddNo(int a, int b);
        }
        interface ISecond
        {
            void AddNo(int a, int b);
        }
        public class test : IFirst, ISecond
        {
            void IFirst.AddNo(int a, int b)
            {
                Console.WriteLine(" First Interface Additon: " + (a + b));
            }
            void ISecond.AddNo(int a, int b)
            {
                Console.WriteLine(" Second Interface Additon: " + (a + b));
            }
        }
        public void Greeting()
        {
            Console.WriteLine(" Hello World ");
        }
        internal class Program
        {
            static void Main(string[] args)
            {
                test obj = new test();

                Explicit_Inteface Exp = new Explicit_Inteface();
                Exp.Greeting();

                IFirst first = obj;
                first.AddNo(10, 20);

                ISecond second = obj;
                second.AddNo(30, 40);

                Console.WriteLine();
            }
        }

    }
}
