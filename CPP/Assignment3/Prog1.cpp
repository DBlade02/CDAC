// Q1. Basic Class
// Write a program in C++ to create a class Car with data members name and speed.
// ● Use a member function display() to print values.
// ● Create two objects and display their details.

#include <iostream>
using namespace std;

class Car {
    private:
        string name;
        int speed;
    public:
        Car(string name, int speed) {
            this->name = name;
            this->speed = speed;
        }
        void display() {
            cout << "Name: " << name << endl;
            cout << "Speed: " << speed << endl;
        }
};

int main() {
    Car car1("Toyota", 100);
    Car car2("Honda", 120);
    car1.display();
    cout << endl;
    car2.display();
    return 0;
}