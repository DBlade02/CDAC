//15. Write a C++ program to print Pascal’s triangle up to n rows.
#include <iostream>
using namespace std;
int main() {
    int n;
    cout << "Enter number of rows: ";
    cin >> n;
    for (int i = 0; i < n; i++) {
        int val = 1;  
        for (int space = 0; space < n - i - 1; space++) {
            cout << "  ";
        }
      
        for (int j = 0; j <= i; j++) {
            cout << val << "   ";
            val = val * (i - j) / (j + 1);  
        }
        cout << endl;
    }
    return 0;
}
