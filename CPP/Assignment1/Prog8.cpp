//8. Write a C++ program to take n elements in an array and print them in reverse order.
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
    cout<<"Elements of array in reverse order : "<<endl;
     for(int i=n-1;i>=0;i--){
        cout<<arr[i]<<" ";
     }
    return 0;
}
