// 2.Title: Employee Payroll Management System (with Dynamic Bonus
// Calculation)
// Problem Statement: Design a C++ program to manage employees of a
// company. Each employee has common details (name, ID, base salary), but
// different roles (e.g., Manager, Developer) that determine their bonus. You
// must use classes, inheritance, encapsulation, constructors, destructors, and
// pointers to: ● Store and display employee information. ● Dynamically
// allocate memory for employees. ● Compute their total salary (base + bonus).
// ● Ensure proper cleanup of allocated memory.
// Requirements:
// 1. Base Class: Employee ○ Private Data Members: ■ string name ■ int id ■
// f
//  loat baseSalary ○ Protected Member: ■ float bonus ○ Public Functions: ■
// Parameterized Constructor to initialize name, id, salary. ■ virtual void
// calculateBonus() → base version sets bonus = 0. ■ virtual void display() →
// prints employee details. ■ Virtual Destructor (for safe cleanup).
// 2. Derived Class: Manager (inherits from Employee) ○ Overrides
// calculateBonus() → bonus = 40% of baseSalary. ○ Overrides display() → shows
// “Manager” and total salary.
// 3. Derived Class: Developer (inherits from Employee) ○ Overrides
// calculateBonus() → bonus = 25% of baseSalary. ○ Overrides display() → shows
// “Developer” and total salary.
// 4. Main Function Logic: ○ Ask user how many employees to create. ○
// Dynamically create an array of Employee* pointers (using new). ○ Let the
// user choose the type (Manager or Developer) for each. ○ Use runtime
// polymorphism (Employee* e = new Manager(...)) to store objects. ○ Call
// calculateBonus() and display() for each employee. ○ Finally, delete all
// dynamically allocated objects safely.
#include <iostream>
#include <string>
using namespace std;

class Employee {
private:
    string name;
    int id;
    float baseSalary;

protected:
    float bonus;

public:
    Employee(string n, int i, float bs) : name(n), id(i), baseSalary(bs), bonus(0.0) {}
    
    virtual void calculateBonus() {
        bonus = 0.0;
    }
    
    virtual void display() {
        cout << "ID: " << id 
             << " | Name: " << name 
             << " | Base Salary: ₹" << baseSalary 
             << " | Bonus: ₹" << bonus 
             << " | Total Salary: ₹" << (baseSalary + bonus) << endl;
    }
    
    float getBaseSalary() { return baseSalary; }
    
    virtual ~Employee() {
        cout << "Employee with ID " << id << " destroyed." << endl;
    }
};

class Manager : public Employee {
public:
    Manager(string n, int i, float bs) : Employee(n, i, bs) {}

    void calculateBonus() override {
        bonus = 0.4f * getBaseSalary();
    }

    void display() override {
        cout << "Role: Manager | ";
        Employee::display();
    }
};

class Developer : public Employee {
public:
    Developer(string n, int i, float bs) : Employee(n, i, bs) {}

    void calculateBonus() override {
        bonus = 0.25f * getBaseSalary();
    }

    void display() override {
        cout << "Role: Developer | ";
        Employee::display();
    }
};

int main() {
    int noe;
    cout << "Enter number of employees: ";
    cin >> noe;
    
    Employee** employees = new Employee*[noe];
    
    for (int i = 0; i < noe; i++) {
        int category;
        string name;
        int id;
        float baseSalary;
        
        cout << "\n--- Employee " << (i + 1) << " ---" << endl;
        cout << "Enter category (1 = Manager, 2 = Developer): ";
        cin >> category;
        
        cout << "Enter ID: ";
        cin >> id;
        cout << "Enter Name: ";
        cin >> name;
        cout << "Enter Base Salary: ";
        cin >> baseSalary;
        
        if (category == 1) {
            employees[i] = new Manager(name, id, baseSalary);
        } else if (category == 2) {
            employees[i] = new Developer(name, id, baseSalary);
        } else {
            cout << "Invalid category! Try again." << endl;
            i--;
        }
    }
    
    cout << "\n========== EMPLOYEE DETAILS ==========" << endl;
    for (int i = 0; i < noe; i++) {
        employees[i]->calculateBonus();
        employees[i]->display();
    }
    
    cout << "\n========== CLEANUP ==========" << endl;
    for (int i = 0; i < noe; i++) {
        delete employees[i];
    }
    delete[] employees;
    
    return 0;
}