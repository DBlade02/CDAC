// Q4. Bank Account
// Create a class BankAccount with:
// ● Data members: accountNumber, balance.
// ● Functions: deposit(), withdraw(), displayBalance().
// ● Perform deposit and withdrawal operations using objects.

#include <iostream>
using namespace std;

class BankAccount {
private:
    int accountNumber;
    double balance;

public:
    void input(int accountNumber, double balance) {
        this->accountNumber = accountNumber;
        this->balance = balance;
    }

    void display() {
        cout << "Account Number: " << accountNumber << endl;
        cout << "Balance: " << balance << endl;
    }
};

int main() {
    BankAccount account1, account2;

    account1.input(123456, 1000.0);
    account2.input(789012, 500.0);

    account1.display();
    account2.display();

    return 0;
}