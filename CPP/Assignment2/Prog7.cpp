// Dynamic Integer 
// Write a program in C++ to dynamically allocate memory for a single integer using 
// new, assign a value, display it, and then free the memory using delete.

#include <iostream>
using namespace std;

int main() {
    int *num = new int;

    cout << "Enter an integer value: ";
    cin >> *num;

    cout << "Value stored in dynamically allocated memory: " << *num << endl;
    cout << "Memory address: " << num << endl;

    delete num;
    num = nullptr;

    cout << "Memory has been freed successfully." << endl;

    return 0;
}
