//Basic Pointer 
/*Write a program in C++ to declare an integer variable, store its address in a 
pointer, and display both the value of the variable and its address using the 
pointer.*/

#include <iostream>
using namespace std;

int main() {
    int var = 42;
    int* ptr = &var; 

    cout << "Value of the variable: " << *ptr << endl;

    cout << "Address of the variable: " << ptr << endl;

    return 0;
}