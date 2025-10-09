// Q7. Library Management
// Create a class Book with data members title, author, and price.
// ● Write functions to input and display details.
// ● Create an array of 5 books and print the book with the highest price.

#include <iostream>
#include <string>
using namespace std;

class Book{
private:
    string title;
    string author;
    float price;

public:
    void input()
    {
        cout << "Enter book title: "; 
        getline(cin, title);

        cout << "Enter author name: ";
        getline(cin, author);

        cout << "Enter price: ";
        cin >> price;
        cin.ignore(); 
    }

    void display()
    {
        cout << "Title: " << title << endl;
        cout << "Author: " << author << endl;
        cout << "Price: Rs. " << price << endl;
    }

    float getPrice()
    {
        return price;
    }
};

int main()
{
    Book books[3];
    int highestIndex = 0;

    cout << "Enter details of 3 books:\n";
    for (int i = 0; i < 3; i++)
    {
        cout << "\nBook " << i + 1 << ":\n";
        books[i].input();
    }

    for (int i = 1; i < 3; i++)
    {
        if (books[i].getPrice() > books[highestIndex].getPrice())
        {
            highestIndex = i;
        }
    }

    cout << "\n--- Book with Highest Price ---\n";
    books[highestIndex].display();

    return 0;
}
