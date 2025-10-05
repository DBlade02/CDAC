//5. Write a C++ program that takes two numbers and an operator (+, -, *, /) as input and performs the corresponding operation.
#include <iostream>
using namespace std;
int main()
{
    int num1,num2;
    char op;
    cout << "Enter two numbers :"<<endl;
    cin>>num1>>num2;
     cout << "Number 1 is :"<<num1<<"  Number 2 is :"<<num2<<endl;
  cout << "Enter Operator:"<<endl;
    cin>>op;
    switch(op) {
        case '+':
            cout << "Addition: " << (num1 + num2) << endl;
            break;
        case '-':
            cout << "Subtraction: " << (num1 - num2) << endl;
            break;
        case '*':
            cout << "Multiplication: " << (num1 * num2) << endl;
            break;
        case '/':
            cout << "Result: " << (num1 / num2) << endl; 
            break;
        default:
            cout << "Invalid operator!" << endl;
    }
          return 0;
}
