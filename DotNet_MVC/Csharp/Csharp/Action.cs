using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Csharp
{
    internal class Action
    {
        private static int result;
        static void Main(string[] args)
        {
            Action<int, int> Addition = AddNumbers;
            Addition(10, 20);
            Console.WriteLine($"Addition = {result}");
        }

        private static void AddNumbers(int param1, int param2)
        {
            result = param1 + param2;
        }

    }
}
