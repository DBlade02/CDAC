// Q7. Library Management
// Create a class Book with data members title, author, and price.
// ● Write functions to input and display details.
// ● Create an array of 5 books and print the book with the highest price.

#include <iostream>
using namespace std;

class Book
{
private:
    string title;
    string author;
    float price;

public:
    // Function to input book details
    void input()
    {
        cout << "Enter book title: ";
        cin.ignore(); // To clear leftover newline in input buffer
        getline(cin, title);

        cout << "Enter author name: ";
        getline(cin, author);

        cout << "Enter price: ";
        cin >> price;
    }

    // Function to display book details
    void display()
    {
        cout << "Title: " << title << endl;
        cout << "Author: " << author << endl;
        cout << "Price: Rs. " << price << endl;
    }

    // Getter for price
    float getPrice()
    {
        return price;
    }
};

int main()
{
    Book books[5];
    int highestIndex = 0;

    cout << "Enter details of 5 books:\n";
    for (int i = 0; i < 5; i++)
    {
        cout << "\nBook " << i + 1 << ":\n";
        books[i].input();
    }

    // Find the book with the highest price
    for (int i = 1; i < 5; i++)
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
