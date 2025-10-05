//9. Write a C++ program to check if a given number is palindromic (reads the same forward and backward)
#include <iostream>
using namespace std;
int main()
{
    int num;
   
    cout << "Enter a Number:";
    cin>>num;
     int n=num;
int digit,rev=0;
    while(num>0){
  digit=num%10;
      rev=rev*10+digit;
      num=num/10;
    }
     if(n==rev){
        cout<<"Its a Palindrome";
     }
    else
        cout<<"Its not a Palindrome";
    return 0;
}
