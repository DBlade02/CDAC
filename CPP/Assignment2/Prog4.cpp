// Dynamic Memory Allocation 
// Write a program in C++ to dynamically allocate memory for an array of 5 integers 
// using a pointer, take input from the user, and display the array elements.

#include <iostream>
using namespace std;

int main() {
    int* arr = new int[5]; // Dynamically allocate memory for an array of 5 integers
    
    cout << "Enter 5 integers: " << endl;
    for (int i = 0; i < 5; i++) {
        cin >> arr[i]; // Take input from the user
    }
    
    cout << "Array elements: " << endl;
    for (int i = 0; i < 5; i++) {
        cout << arr[i] << " "; // Display the array elements
    }
    cout << endl;
    
    delete[] arr; // Deallocate memory
    
    return 0;
}