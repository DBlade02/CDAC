// Pointer Arithmetic 
// Write a program in C++ to create an array of 5 integers. Use a pointer to traverse 
// the array and print all elements using pointer arithmetic.

#include <iostream>
using namespace std;

int main() {
    int arr[5] = {10, 20, 30, 40, 50};
    int* ptr = arr; // Pointer to the first element of the array

    cout << "Array elements using pointer arithmetic:" << endl;
    for (int i = 0; i < 5; i++) {
        cout << *(ptr + i) << " "; // Accessing elements using pointer arithmetic
    }
    cout << endl;

    return 0;
}