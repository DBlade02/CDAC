// Q5. Employee Salary (Parameterized Constructor)
// Write a C++ program to create a class Employee with data members id, name, and salary.
// ● Use a parameterized constructor to initialize values.
// ● Display employee details using a function.

#include <iostream>
using namespace std;

class Employee {
    private:
        int id;
        string name;
        double salary;
    public:
        Employee(int id, string name, double salary) {
            this->id = id;
            this->name = name;
            this->salary = salary;
        }
        void displayEmployeeDetails() {
            cout << "Employee ID: " << id << endl;
            cout << "Employee Name: " << name << endl;
            cout << "Employee Salary: " << salary << endl;
        }
};

int main() {
    Employee employee(101, "Aditya Mogre", 50000.0);
    employee.displayEmployeeDetails();
    return 0;
}