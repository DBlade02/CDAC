//13. Write a C++ program to multiply two matrices.
#include <iostream>
using namespace std;
int main()
{
  int A[2][3] = {
        {1, 2, 3},
        {4, 5, 6}
    };
    int B[3][2] = {
        {7, 8},
        {9, 10},
        {11, 12}
    };
    int mul[2][2]={0};
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            mul[i][j] = 0;
            for (int k = 0; k < 3; k++) {
                mul[i][j] += A[i][k] * B[k][j];
            }
        }
    }
    cout << "Multiplication Matrix:" << endl;
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            cout << mul[i][j] << " ";
        }
        cout << endl;
    }
    return 0;
}
