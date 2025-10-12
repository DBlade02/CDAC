// Function with Pointer 
// Write a program in C++ to pass a pointer to a function that updates the value of a 
// variable.

#include <iostream>
using namespace std;
void updateValue(int* ptr) {
    *ptr = 100; // Update the value at the address pointed to by ptr
}
int main() {
    int num = 50;
    cout << "Before update: " << num << endl;

    updateValue(&num); // Pass the address of num to the function

    cout << "After update: " << num << endl;

    return 0;
}
