// Pointer Re-allocation (basic simulation) 
// Write a program in C++ to dynamically allocate an array of integers using new, fill 
// it with values, then allocate a bigger array, copy the old values into it, add more 
// elements, and release both old and new arrays properly.

#include <iostream>
using namespace std;

int main() {
    int size;
    cout << "Enter initial size of array: ";
    cin >> size;

    int *arr = new int[size];
    cout << "Enter elements: ";
    for (int i = 0; i < size; i++)
        cin >> arr[i];

    int newSize;
    cout << "Enter new size of array: ";
    cin >> newSize;

    int *newArr = new int[newSize];
    for (int i = 0; i < size; i++)
        newArr[i] = arr[i];

    cout << "Enter additional elements: ";
    for (int i = size; i < newSize; i++)
        cin >> newArr[i];

    cout << "New array: ";
    for (int i = 0; i < newSize; i++)
        cout << newArr[i] << " ";
    cout << endl;

    delete[] arr;
    delete[] newArr;

    return 0;
}
