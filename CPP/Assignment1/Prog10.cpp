//10. Write a C++ program to print the Fibonacci series up to n terms.
#include <iostream>
using namespace std;
int main()
{
    int num;
    cout << "Enter a Number:";
    cin>>num;
    int a=0,b=1,sum;
       cout<<a<<" ";
    for(int i=1;i<num;i++){
          sum=a+b;
          a=b;
          b=sum;
          cout<<a<<" ";
    }
    return 0;
}
