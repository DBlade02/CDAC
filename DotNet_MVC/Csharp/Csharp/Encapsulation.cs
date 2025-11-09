using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Csharp
{
    internal class Encapsulation
    {
        private void AccpectData()    
        {
            Console.WriteLine(" Data Accpected ");
        }
        private void ValidateData() 
        {
            Console.WriteLine(" Data Validated ");
        }
        public void SaveRecord() 
        {
            AccpectData();
            ValidateData();
            Console.WriteLine(" Record Saved ");
        }
        static void Main(string[] args)
        {
            Encapsulation obj = new Encapsulation();
            obj.SaveRecord();
        }
    }
}
