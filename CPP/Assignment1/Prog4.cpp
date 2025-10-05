//4. Write a C++ program that checks whether a number entered by the user is even or odd.
#include <iostream>
using namespace std;
int main()
{
    int num;
    cout << "Enter number :"<<endl;
    cin>>num;
    if(num%2==0)
     cout << "This is Even"<<endl;
     else
     cout << "This is Odd"<<endl;
    return 0;
}
