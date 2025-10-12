// Dynamic Array 
// Write a program in C++ to create an array of 5 integers using new, take input 
// from the user, display the array elements, and then release the memory using 
// delete[]. 

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