//6. Write a C++ program that takes n numbers as input, stores them in an array, and finds the largest number.
#include <iostream>
using namespace std;
int main()
{
    int n;
    
    cout << "Enter Number of elements you want to store :"<<endl;
    cin>>n;
    int arr[n];
   
    for(int i=0;i<n;i++){
         int e;
        cout<<"Enter "<<i<<"th element : "<<endl;
        cin>>e;
       arr[i]=e;
    }
    int largest=arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]>largest)
        largest=arr[i];
    }
     cout<<"Largest is : "<<largest<<endl;
    return 0;
}
