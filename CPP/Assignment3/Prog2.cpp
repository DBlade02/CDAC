// Q2. Rectangle (Area & Perimeter)
// Create a class Rectangle with data members length and width.
// ● Add member functions to calculate area and perimeter.
// ● Read values from user and display results./

#include <iostream>
using namespace std;

class Rectangle
{
private:
    double length;
    double width;

public:
    Rectangle(double length, double width)
    {
        this->length = length;
        this->width = width;
    }

    double area()
    {
        return length * width;
    }

    double perimeter()
    {
        return 2 * (length + width);
    }
};

int main()
{
    double length, width;
    cout << "Enter length: ";
    cin >> length;
    cout << "Enter width: ";
    cin >> width;

    Rectangle rect(length, width);

    cout << "Area: " << rect.area() << endl;
    cout << "Perimeter: " << rect.perimeter() << endl;

    return 0;
}
