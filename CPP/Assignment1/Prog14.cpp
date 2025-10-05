//14. A number is an Armstrong number if the sum of its digits raised to the power of the number of digits is equal to the 
//number itself (e.g., 153 = 1³ +5³ + 3³). Write a C++ program to check if a number is Armstrong.
#include <iostream>
using namespace std;
int main()
{
    int num;
    cout << "Enter Number:";
    cin>>num;
int n=num;
    int digit;
    int sum=0;
    while(num>0){
         digit=num%10;
         sum=sum+(digit*digit*digit);
         num=num/10;
    }
    if(sum==n)
    cout<<"Its an Armstrong Number"<<endl;
    else
     cout<<"Its not an Armstrong Number"<<endl;
    return 0;
}
