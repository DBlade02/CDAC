using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http.Headers;
using System.Runtime.Serialization.Formatters;
using System.Text;
using System.Threading.Tasks;

namespace Csharp
{
    internal class Array
    {
        public static void Main(string[] args)
        {
            int[] Array = new int[5];
            Array[0]=10;
            Array[1]=20;
            Array[2]=30;
            Array[3]=40;
            Array[4]=50;
            foreach(var item in Array)
            {
                Console.WriteLine(item);
            }
            Console.WriteLine();
            Console.WriteLine("Length of Array: "+Array.Length);
            Console.WriteLine();

        }
    }
}
