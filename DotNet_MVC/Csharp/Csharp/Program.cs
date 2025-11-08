using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Csharp
{
    class Program
    {
        static void Main(string[] args)
        {
            Predicate<string> CheckIfApple = IsApple;
            bool result = IsApple("I Phone X");
            if (result)
                Console.WriteLine("It's an IPhone");
        }

        private static bool IsApple(string modelName)
        {
            if (modelName == "I Phone X")
                return true;
            else
                return false;
        }
    }
}
