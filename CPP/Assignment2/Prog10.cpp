// Dynamic String 
// Write a program in C++ to dynamically allocate memory for a string using a 
// character pointer and new. Take user input for the string, display it, and then free 
// the memory.

#include <iostream>
using namespace std;

int main() {
    int length;
    cout << "Enter maximum length of the string: ";
    cin >> length;
    cin.ignore();

    char *str = new char[length + 1];

    cout << "Enter the string: ";
    cin.getline(str, length + 1);

    cout << "You entered: " << str << endl;

    delete[] str;

    return 0;
}
