// String with Pointers 
// Write a program in C++ to count the length of a string using a character pointer 
// (without using built-in functions like strlen). 

#include <iostream>
using namespace std;
int stringLength(const char* str) {
    int length = 0;
    while (*str != '\0') { // Iterate until the null terminator is reached
        length++;
        str++; // Move the pointer to the next character
    }
    return length;
}
int main() {
    const int MAX_SIZE = 100;
    char str[MAX_SIZE];

    cout << "Enter a string: ";
    cin.getline(str, MAX_SIZE); // Read a line of text including spaces

    int length = stringLength(str); // Calculate the length of the string

    cout << "Length of the string: " << length << endl;

    return 0;
}