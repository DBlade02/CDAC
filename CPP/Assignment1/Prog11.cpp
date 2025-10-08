//11. Write a C++ program that takes a string as input and counts the number of vowels (a, e, i, o, u).
#include <iostream>
#include<string>
using namespace std;
int main()
{
    string s;
    cout << "Enter a String:";
    cin>>s;
int count=0;
    for(int i=0;i<s.size();i++){
        if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'||s[i]=='A'||s[i]=='E'||s[i]=='I'||s[i]=='O'||s[i]=='U'){
          count++;
        }
    }
    cout<<"Number of vowels are : "<<count;
    return 0;
}
