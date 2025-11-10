using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Csharp
{
    internal class Nullable
    {
        public static void Main()
        {
            Nullable<int> x = null;
            Nullable<float> y = null;
            Nullable<Boolean> z = null;
            string s = null;

            Console.WriteLine("Nullable int: " + x);
            Console.WriteLine("Nullable float: " + y);
            Console.WriteLine("Nullable boolean: " + z);
            Console.WriteLine("String: " + s);

            Console.WriteLine();
        }
    }
}
