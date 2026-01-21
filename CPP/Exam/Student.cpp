#include <iostream>
#include <string>
using namespace std;

class Student {
public:
    string name;
    int rollNumber;

    Student(string n, int r) {
        name = n;
        rollNumber = r;
    }
};

class Marks {
public:
    int subject1, subject2, subject3;

    Marks(int s1, int s2, int s3) {
        subject1 = s1;
        subject2 = s2;
        subject3 = s3;
    }
};

class Result : public Student, public Marks {
public:
    Result(string n, int r, int s1, int s2, int s3)
        : Student(n, r), Marks(s1, s2, s3) {}

    void displayResult() {
        int total = subject1 + subject2 + subject3;
        double percentage = total / 3.0;

        cout << "Name: " << name << endl;
        cout << "Roll Number: " << rollNumber << endl;
        cout << "Total Marks: " << total << endl;
        cout << "Percentage: " << percentage << "%" << endl;
        cout << "--------------------------" << endl;
    }
};

int main() {
    Result student1("Aman Atkari", 01, 85, 90, 78);
    student1.displayResult();

    Result student2("Aditya Mogre", 02, 80, 90, 90);
    student2.displayResult();

    return 0;
}
