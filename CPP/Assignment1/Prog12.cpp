//12. Write a C++ program to find the GCD of two numbers
#include <iostream>
using namespace std;
int main()
{
    int num1,num2;
    cout << "Enter first Number:";
    cin>>num1;
    cout << "Enter second Number:";
    cin>>num2;
int num;
    if(num1<num2)
    num=num1;
    else
    num=num2;
    int greatest=1;
     for (int i = 1; i <= num; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                if (i > greatest)
                    greatest = i;
            }
        }
        cout<<"Greatest is : "<<greatest;


    return 0;
}
