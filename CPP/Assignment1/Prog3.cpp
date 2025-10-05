//3. Write a C++ program to swap two numbers without using a third variable
#include <iostream>
using namespace std;
int main()
{
    int num1,num2;
    cout << "Enter two numbers :"<<endl;
    cin>>num1>>num2;
     cout << "Number 1 is :"<<num1<<endl;
          cout << "Number 2 is :"<<num2<<endl;
          num1=num1+num2;
          num2=num1-num2;
          num1=num1-num2;
       cout << "After Swapping \n Number 1 is :"<<num1<<endl;
          cout << "Number 2 is :"<<num2<<endl;
    return 0;
}
