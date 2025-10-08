// Q6. Complex Number (Object as Argument)
// Create a class Complex with data members real and imag.
// ● Add a member function add() that takes another Complex object and returns the result as a new object.
// ● Display the sum of two complex numbers.

#include <iostream>
using namespace std;

class Complex
{
public:
    int real, imag;
    void add(Complex c1, Complex c2)
    {
        this->real = c1.real + c2.real;
        this->imag = c1.imag + c2.imag;
    }
    void display()
    {
        cout << "Sum: " << real << " + " << imag << "i" << endl;
    }
};

int main()
{
    Complex c1, c2, sum;
    cout << "Enter real and imaginary part of first complex number: ";
    cin >> c1.real >> c1.imag;
    cout << "Enter real and imaginary part of second complex number: ";
    cin >> c2.real >> c2.imag;
    sum.add(c1, c2);
    sum.display();
    return 0;
}