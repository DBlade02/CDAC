using System;
using System.IO;


namespace AdityaExamples
{
internal class Aditya_FileIO
{
static void Main()
{
string path = "aditya.txt";
File.WriteAllText(path, "This file is created for Aditya.");
Console.WriteLine($"Wrote file '{path}' in working directory.\nContents: {File.ReadAllText(path)}");
}
}
}
