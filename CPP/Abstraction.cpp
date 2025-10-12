//Abstract class with pure virtual function

#include<iostream>
using namespace std;

class A{
    private:
    virtual void display(){
        cout<<"This is A class"<<endl;
    }
    public:
    virtual ~A() = default; // Virtual destructor for proper cleanup of derived classes
};

class B : public A{
    public:
    void display() override {
        cout<< "This is B class "<< endl;
        A::display();
    }   
};

int main(){
    A* obj = new B();
    obj->display();
    delete obj;

    return 0;
}

// Explanation:
// In this code, we have two classes A and B. Class B inherits from class A
// and overrides the display method. In the main function, we create a pointer of type A
// and assign it an object of type B. When we call the display method using this pointer,
// the overridden method in class B is executed, demonstrating abstraction and polymorphism.