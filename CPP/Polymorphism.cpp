#include<iostream>
using namespace std;

class A{
    public:
    virtual void display(){
        cout<<"This is A class"<<endl;
    }
};

class b : public A{
    public:
    void display() override {
        cout<< "This is B class "<< endl;
        A::display();   
    }
};

int main(){
    A* obj = new b();
    obj->display();
    delete obj;

    return 0;
}