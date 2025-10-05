//7. Write a C++ program that takes an integer input and calculates the sum of its digits.
#include <iostream>
using namespace std;
int main()
{
    int num;
    cout << "Enter a Number:";
    cin>>num;
int digit,sum=0;
    while(num>0){
  digit=num%10;
      sum=sum+digit;
      num=num/10;
    }
   cout<<"Sum of digits is : "<<sum<<endl;
    return 0;
}
