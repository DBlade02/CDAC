//1.Title: Smart Inventory System with Dynamic Memory and Inheritance
/*Problem Statement:
Design a program to manage an inventory system for a store.
Each item in the store belongs to a specific category (like Electronics or Groceries), but the
data must be stored and managed without using virtual functions.
You must handle object relationships, memory allocation, and cleanup properly.

Objectives:
Implement:
● Encapsulation (private/protected members)
● Parameterized Constructors & Destructors
● Inheritance (Base → Derived classes)
● Dynamic allocation using pointers (new / delete)
● Pointer-to-object relationships (no virtual keyword)

Requirements:
1. Base Class: Item
○ Private members:
■ string name
■ int id

■ float price
○ Protected member:
■ int quantity
○ Public functions:
■ Parameterized constructor to initialize all members.
■ void display() — prints item details.
■ float getTotalValue() — returns price * quantity.
■ Destructor — prints when the item object is destroyed.

2. Derived Class 1: Electronics
○ Additional data members:
■ int warrantyYears
■ float powerUsage
○ Constructor should call base class constructor using initializer list.
○ void displayDetails() — prints both base and derived details.
○ Destructor prints a message for cleanup.

3. Derived Class 2: Grocery
○ Additional data members:
■ string expiryDate
■ float weight

○ Constructor and destructor similar to Electronics.
○ Function void displayDetails() to show all info.

4. Main Function Logic:
○ Ask user how many total items are in inventory.
○ Dynamically create an array of pointers to Electronics and Grocery
objects.
○ For each item, ask the user for category and input details.
○ Display all item details and total inventory value.
○ Properly delete all dynamically allocated memory at the end.*/

#include <iostream>
#include <string>
#include <iomanip>
using namespace std;

class Item {
private:
    string name;
    int id;
    float price;

protected:
    int quantity;

public:
    Item(string n, int i, float p, int q) : name(n), id(i), price(p), quantity(q) {
        cout << "Item constructor called for: " << name << endl;
    }

    void display() const {
        cout << "ID: " << id << endl;
        cout << "Name: " << name << endl;
        cout << "Price: ₹" << fixed << setprecision(2) << price << endl;
        cout << "Quantity: " << quantity << endl;
    }

    float getTotalValue() const {
        return price * quantity;
    }

    ~Item() {
        cout << "Item destructor called for: " << name << endl;
    }

    string getName() const { return name; }
};

class Electronics : public Item {
private:
    int warrantyYears;
    float powerUsage;

public:
    Electronics(string n, int i, float p, int q, int w, float pu)
        : Item(n, i, p, q), warrantyYears(w), powerUsage(pu) {
        cout << "Electronics constructor called" << endl;
    }

    void displayDetails() const {
        cout << "\n=== ELECTRONICS ITEM ===" << endl;
        display(); 
        cout << "Warranty: " << warrantyYears << " years" << endl;
        cout << "Power Usage: " << powerUsage << " watts" << endl;
        cout << "Total Value: ₹" << fixed << setprecision(2) << getTotalValue() << endl;
    }

    ~Electronics() {
        cout << "Electronics destructor called for: " << getName() << endl;
    }
};

class Grocery : public Item {
private:
    string expiryDate;
    float weight;

public:
    Grocery(string n, int i, float p, int q, string exp, float w)
        : Item(n, i, p, q), expiryDate(exp), weight(w) {
        cout << "Grocery constructor called" << endl;
    }

    void displayDetails() const {
        cout << "\n=== GROCERY ITEM ===" << endl;
        display(); 
        cout << "Expiry Date: " << expiryDate << endl;
        cout << "Weight: " << weight << " kg" << endl;
        cout << "Total Value: ₹" << fixed << setprecision(2) << getTotalValue() << endl;
    }

    ~Grocery() {
        cout << "Grocery destructor called for: " << getName() << endl;
    }
};

int main() {
    int totalItems;
    
    cout << "========================================" << endl;
    cout << "   SMART INVENTORY MANAGEMENT SYSTEM   " << endl;
    cout << "========================================\n" << endl;
    
    cout << "Enter the total number of items in inventory: ";
    cin >> totalItems;
    cin.ignore(); 
    
    if (totalItems <= 0) {
        cout << "Invalid number of items!" << endl;
        return 1;
    }
    
    Electronics** electronicsItems = new Electronics*[totalItems];
    Grocery** groceryItems = new Grocery*[totalItems];
    int* itemTypes = new int[totalItems]; // 1 for Electronics, 2 for Grocery
    
    int eCount = 0, gCount = 0;
    
    cout << "\n--- INPUT PHASE ---\n" << endl;
    for (int i = 0; i < totalItems; i++) {
        cout << "\nItem " << (i + 1) << " of " << totalItems << endl;
        cout << "Select category:" << endl;
        cout << "1. Electronics" << endl;
        cout << "2. Grocery" << endl;
        cout << "Choice: ";
        
        int choice;
        cin >> choice;
        cin.ignore();
        
        string name;
        int id, quantity;
        float price;
        
        cout << "Enter Item Name: ";
        getline(cin, name);
        cout << "Enter Item ID: ";
        cin >> id;
        cout << "Enter Price: $";
        cin >> price;
        cout << "Enter Quantity: ";
        cin >> quantity;
        cin.ignore();
        
        if (choice == 1) {
            int warranty;
            float power;
            cout << "Enter Warranty (years): ";
            cin >> warranty;
            cout << "Enter Power Usage (watts): ";
            cin >> power;
            cin.ignore();
            
            electronicsItems[eCount] = new Electronics(name, id, price, quantity, warranty, power);
            itemTypes[i] = 1;
            eCount++;
            
        } else if (choice == 2) {
            string expiry;
            float weight;
            cout << "Enter Expiry Date (DD/MM/YYYY): ";
            getline(cin, expiry);
            cout << "Enter Weight (kg): ";
            cin >> weight;
            cin.ignore();
            
            groceryItems[gCount] = new Grocery(name, id, price, quantity, expiry, weight);
            itemTypes[i] = 2;
            gCount++;
            
        } else {
            cout << "Invalid choice! Skipping item." << endl;
            i--; 
            totalItems--;
        }
    }
    
    cout << "\n\n========================================" << endl;
    cout << "        INVENTORY DETAILS               " << endl;
    cout << "========================================" << endl;
    
    float totalInventoryValue = 0.0;
    int eIdx = 0, gIdx = 0;
    
    for (int i = 0; i < totalItems; i++) {
        if (itemTypes[i] == 1) {
            electronicsItems[eIdx]->displayDetails();
            totalInventoryValue += electronicsItems[eIdx]->getTotalValue();
            eIdx++;
        } else if (itemTypes[i] == 2) {
            groceryItems[gIdx]->displayDetails();
            totalInventoryValue += groceryItems[gIdx]->getTotalValue();
            gIdx++;
        }
    }
    
    cout << "\n========================================" << endl;
    cout << "TOTAL INVENTORY VALUE: ₹" << fixed << setprecision(2) << totalInventoryValue << endl;
    cout << "========================================\n" << endl;
    
    cout << "\n--- CLEANUP PHASE ---\n" << endl;
    
    for (int i = 0; i < eCount; i++) {
        delete electronicsItems[i];
    }
    
    for (int i = 0; i < gCount; i++) {
        delete groceryItems[i];
    }
    
    delete[] electronicsItems;
    delete[] groceryItems;
    delete[] itemTypes;
    
    cout << "\nAll memory deallocated successfully!" << endl;
    cout << "Program terminated." << endl;
    
    return 0;
}