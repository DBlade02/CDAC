#include<iostream>
using namespace std;

class A{
    public:
    void display(){
        cout<<"This is A class"<<endl;
    }
};

class B : public A{
    public:
    void display(){
        A::display();
        cout<< "This is B class "<< endl;
        
    }   
};

int main(){
    B obj;
    obj.display();
}
