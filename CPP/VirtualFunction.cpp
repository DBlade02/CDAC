#include <iostream>
using namespace std;

// Base class
class Shape {
public:
    virtual void draw() {       // Virtual function
        cout << "Drawing a generic shape" << endl;
    }
};

// Derived class 1
class Circle : public Shape {
public:
    void draw() override {      // Override base class function
        cout << "Drawing a Circle" << endl;
    }
};

// Derived class 2
class Rectangle : public Shape {
public:
    void draw() override {      // Override base class function
        cout << "Drawing a Rectangle" << endl;
    }
};

int main() {
    Shape* shape1;  // Base class pointer

    Circle c;
    Rectangle r;

    // Point to Circle object
    shape1 = &c;
    shape1->draw();   // Calls Circle's draw()

    // Point to Rectangle object
    shape1 = &r;
    shape1->draw();   // Calls Rectangle's draw()

    return 0;
}