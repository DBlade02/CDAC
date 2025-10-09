// 3.Title: Menu-Driven Employee Management System usingClasses, Objects, 
// Inheritance, and Dynamic Memory in C++  
// Problem Statement: Design a Menu-Driven Employee Management System 
// for a company that manages two types of employees: 1. FullTimeEmployee 2. 
// PartTimeEmployee You must: ● Use inheritance to derive these two classes 
// from a base class Employee. ● Use encapsulation for data hiding 
// (private/protected members). ● Create objects dynamically using pointers. ● 
// Display and manage data using a menu-driven interface.  
// Class Design Base Class: Employee Private Members: ● string name ● int 
// empID Protected Member: ● float salary Public Functions: ● Parameterized 
// constructor (for name and empID) ● void displayBasic() → shows name and 
// ID ● float getSalary() → returns salary ● Destructor → prints destruction 
// message  
// Derived Class: FullTimeEmployee Additional Members: ● float basicPay, float 
// bonus Constructor: ● Uses initializer list to call base constructor and initialize 
// basicPay and bonus Member Function: ● void calculateSalary() → salary = 
// basicPay + bonus ● void displayDetails() → display all employee info ● 
// Destructor → prints cleanup message  
// Derived Class: PartTimeEmployee Additional Members: ● int hoursWorked ● 
// f
//  loat hourlyRate Constructor: ● Calls base class constructor and initializes 
// new members Member Function: ● void calculateSalary() → salary = 
// hoursWorked * hourlyRate ● void displayDetails() ● Destructor → prints 
// cleanup message 
// Menu Options in main() 1.Add Full-Time Employee 2.Add Part-Time 
// Employee 3.Display All Employees 4.Search Employee by ID 5.Delete 
// Employee (by ID) 6.Exit Program

#include <iostream>
#include <string>
using namespace std;

class Employee {
private:
    string name;
    int empId;

protected:
    float salary;

public:
    Employee(string n, int eid) : name(n), empId(eid), salary(0.0) {}
    
    void displayBasic() {
        cout << "Name: " << name << " | Employee ID: " << empId;
    }
    
    float getSalary() {
        return salary;
    }
    
    int getEmpId() {
        return empId;
    }
    
    virtual void calculateSalary() = 0;
    virtual void displayDetails() = 0;
    virtual string getType() = 0;
    
    virtual ~Employee() {
        cout << "Employee destructor called for ID: " << empId << endl;
    }
};

class FullTimeEmployee : public Employee {
private:
    float basicPay;
    float bonus;

public:
    FullTimeEmployee(string n, int eid, float bp, float bo) 
        : Employee(n, eid), basicPay(bp), bonus(bo) {}
    
    void calculateSalary() override {
        salary = basicPay + bonus;
    }
    
    void displayDetails() override {
        displayBasic();
        cout << " | Type: Full-Time | Basic Pay: ₹" << basicPay 
             << " | Bonus: ₹" << bonus 
             << " | Total Salary: ₹" << salary << endl;
    }
    
    string getType() override {
        return "FullTime";
    }
    
    ~FullTimeEmployee() {
        cout << "FullTimeEmployee destructor called" << endl;
    }
};

class PartTimeEmployee : public Employee {
private:
    int hoursWorked;
    float hourlyRate;

public:
    PartTimeEmployee(string n, int eid, int hw, float hr) 
        : Employee(n, eid), hoursWorked(hw), hourlyRate(hr) {}
    
    void calculateSalary() override {
        salary = hoursWorked * hourlyRate;
    }
    
    void displayDetails() override {
        displayBasic();
        cout << " | Type: Part-Time | Hours Worked: " << hoursWorked 
             << " | Hourly Rate: ₹" << hourlyRate 
             << " | Total Salary: ₹" << salary << endl;
    }
    
    string getType() override {
        return "PartTime";
    }
    
    ~PartTimeEmployee() {
        cout << "PartTimeEmployee destructor called" << endl;
    }
};

Employee** employees = nullptr;
int maxSize = 100;
int currentCount = 0;

void addFullTimeEmployee() {
    if (currentCount >= maxSize) {
        cout << "Employee list is full!" << endl;
        return;
    }
    
    string name;
    int id;
    float basicPay, bonus;
    
    cout << "\nEnter Name: ";
    cin >> name;
    cout << "Enter Employee ID: ";
    cin >> id;
    cout << "Enter Basic Pay: ";
    cin >> basicPay;
    cout << "Enter Bonus: ";
    cin >> bonus;
    
    employees[currentCount++] = new FullTimeEmployee(name, id, basicPay, bonus);
    cout << "Full-Time Employee added successfully!\n" << endl;
}

void addPartTimeEmployee() {
    if (currentCount >= maxSize) {
        cout << "Employee list is full!" << endl;
        return;
    }
    
    string name;
    int id, hoursWorked;
    float hourlyRate;
    
    cout << "\nEnter Name: ";
    cin >> name;
    cout << "Enter Employee ID: ";
    cin >> id;
    cout << "Enter Hours Worked: ";
    cin >> hoursWorked;
    cout << "Enter Hourly Rate: ";
    cin >> hourlyRate;
    
    employees[currentCount++] = new PartTimeEmployee(name, id, hoursWorked, hourlyRate);
    cout << "Part-Time Employee added successfully!\n" << endl;
}

void displayAllEmployees() {
    if (currentCount == 0) {
        cout << "\nNo employees to display!\n" << endl;
        return;
    }
    
    cout << "\n========== ALL EMPLOYEES ==========" << endl;
    int fullTimeCount = 0, partTimeCount = 0;
    
    for (int i = 0; i < currentCount; i++) {
        if (employees[i] != nullptr) {
            employees[i]->calculateSalary();
            employees[i]->displayDetails();
            
            if (employees[i]->getType() == "FullTime")
                fullTimeCount++;
            else
                partTimeCount++;
        }
    }
    
    cout << "\nTotal Full-Time: " << fullTimeCount 
         << " | Total Part-Time: " << partTimeCount << endl << endl;
}

void searchEmployeeById() {
    if (currentCount == 0) {
        cout << "\nNo employees in system!\n" << endl;
        return;
    }
    
    int searchId;
    cout << "\nEnter Employee ID to search: ";
    cin >> searchId;
    
    bool found = false;
    for (int i = 0; i < currentCount; i++) {
        if (employees[i] != nullptr && employees[i]->getEmpId() == searchId) {
            cout << "\nEmployee Found:" << endl;
            employees[i]->calculateSalary();
            employees[i]->displayDetails();
            found = true;
            break;
        }
    }
    
    if (!found) {
        cout << "Employee with ID " << searchId << " not found!\n" << endl;
    }
}

void deleteEmployeeById() {
    if (currentCount == 0) {
        cout << "\nNo employees to delete!\n" << endl;
        return;
    }
    
    int deleteId;
    cout << "\nEnter Employee ID to delete: ";
    cin >> deleteId;
    
    bool found = false;
    for (int i = 0; i < currentCount; i++) {
        if (employees[i] != nullptr && employees[i]->getEmpId() == deleteId) {
            delete employees[i];
            employees[i] = nullptr;
            
            for (int j = i; j < currentCount - 1; j++) {
                employees[j] = employees[j + 1];
            }
            currentCount--;
            
            cout << "Employee with ID " << deleteId << " deleted successfully!\n" << endl;
            found = true;
            break;
        }
    }
    
    if (!found) {
        cout << "Employee with ID " << deleteId << " not found!\n" << endl;
    }
}

void displayMenu() {
    cout << "========== EMPLOYEE MANAGEMENT SYSTEM ==========" << endl;
    cout << "1. Add Full-Time Employee" << endl;
    cout << "2. Add Part-Time Employee" << endl;
    cout << "3. Display All Employees" << endl;
    cout << "4. Search Employee by ID" << endl;
    cout << "5. Delete Employee by ID" << endl;
    cout << "6. Exit Program" << endl;
    cout << "================================================" << endl;
    cout << "Enter your choice: ";
}

int main() {
    employees = new Employee*[maxSize];
    
    for (int i = 0; i < maxSize; i++) {
        employees[i] = nullptr;
    }
    
    int choice;
    
    do {
        displayMenu();
        cin >> choice;
        
        switch (choice) {
            case 1:
                addFullTimeEmployee();
                break;
            case 2:
                addPartTimeEmployee();
                break;
            case 3:
                displayAllEmployees();
                break;
            case 4:
                searchEmployeeById();
                break;
            case 5:
                deleteEmployeeById();
                break;
            case 6:
                cout << "\nExiting program..." << endl;
                break;
            default:
                cout << "\nInvalid choice! Please try again.\n" << endl;
        }
        
    } while (choice != 6);
    
    cout << "\n========== CLEANUP ==========" << endl;
    for (int i = 0; i < currentCount; i++) {
        if (employees[i] != nullptr) {
            delete employees[i];
        }
    }
    delete[] employees;
    
    cout << "All resources freed. Program terminated." << endl;
    return 0;
}