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

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            cout << "Insufficient balance. Withdrawal failed." << endl;
        }
    }
};

int main() {
    BankAccount account1, account2;

    account1.input(1, 1000.0);
    account1.display();
    account2.input(2, 500.0);
    account2.display();

    cout << "Depositing 500 into account 1:" << endl;
    account1.deposit(500.0);
    account1.display();

    cout << "Withdrawing 200 from account 2:" << endl;
    account2.withdraw(200.0);    
    account2.display();

    return 0;
}