using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Csharp
{
    internal class Dynamic_Array
    {
        public static void Main(string[] args) 
        {
            Console.WriteLine("Before resize array");
            int[] numbers = new int[2];
            numbers[0] = 10;    
            numbers[1] = 20;
            Console.WriteLine("Initial array:");
            foreach (var num in numbers)
            {
                Console.WriteLine(num);
            }
            
            // Resize the array to add more elements and make it Dynamic Array 
            Console.WriteLine("After Resized array");
            Array.Resize(ref numbers, 4);
            numbers[2] = 30;
            numbers[3] = 40;
            for (int i = 0; i < numbers.Length; i++)
            {
                Console.WriteLine(numbers[i]);
            }
            
            
        }
    }
}
