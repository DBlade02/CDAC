 
// Function Returning Dynamic Memory 
// Write a program in C++ with a function that returns a pointer to a dynamically 
// allocated array. In main(), call the function, display the array, and free the 
// memory.

#include <iostream>
using namespace std;

int* createArray(int n) {
    int *arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = i + 1;
    }
    return arr;
}

int main() {
    int n;
    cout << "Enter size of array: ";
    cin >> n;

    int *array = createArray(n);

    cout << "Array elements: ";
    for (int i = 0; i < n; i++)
        cout << array[i] << " ";
    cout << endl;

    delete[] array;

    return 0;
}
