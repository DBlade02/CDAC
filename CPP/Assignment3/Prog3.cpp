// Q3. Student Details
// Create a class Student with data members rollNo, name, and marks.
// ● Add member function input() to take values.
// ● Add function display() to print them.
// ● Create an array of 3 students and display all details.

#include <iostream>
using namespace std;

class Student {
private:
    int rollNo;
    string name;
    int marks;

public:
    void input(int rollNo, string name, int marks) {
        this->rollNo = rollNo;
        this->name = name;
        this->marks = marks;
    }

    void display() {
        cout << "Roll No: " << rollNo << endl;
        cout << "Name: " << name << endl;
        cout << "Marks: " << marks << endl;
    }
}; // ✅ Missing semicolon after class definition

int main() {
    Student student[3];

    for (int i = 0; i < 3; i++) {
        int rollNo, marks;
        string name;

        cout << "\nEnter details for Student " << i + 1 << ":" << endl;
        cout << "Roll No: ";
        cin >> rollNo;
        cout << "Name: ";
        cin >> name;
        cout << "Marks: ";
        cin >> marks;

        student[i].input(rollNo, name, marks);
    }

    cout << "\n--- Student Details ---\n";
    for (int i = 0; i < 3; i++) {
        cout << "\nStudent " << i + 1 << ":" << endl;
        student[i].display();
    }

    return 0;
}
