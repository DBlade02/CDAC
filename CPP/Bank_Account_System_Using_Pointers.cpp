//Bank Account System Using Pointers
#include <iostream>
#include <string>
using namespace std;

class BankAccount {
private:
    string name;
    double balance;

public:
    BankAccount(string n, double b) {
        name = n;
        balance = b;
    }

    void deposit(double amount) {
        balance += amount;
        cout << "Deposited Rs" << amount << " successfully.\n";
    }

    void withdraw(double amount) {
        if (amount > balance)
            cout << "Insufficient balance!\n";
        else {
            balance -= amount;
            cout << "Withdrawn Rs" << amount << " successfully.\n";
        }
    }

    void display() {
        cout << "\nAccount Holder: " << name << endl;
        cout << "Current Balance: Rs" << balance << endl;
    }
};

int main() {
    // Create an object
    BankAccount acc("Aditya Mogre", 5000.0);

    // Pointer to object
    BankAccount *ptr = &acc;

    // Access members using pointer
    ptr->display();
    ptr->deposit(2000);
    ptr->display();
    ptr->withdraw(1500);
    ptr->display();

    return 0;
}
