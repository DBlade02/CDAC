#include <iostream>
#include <vector>
#include <string>
#include <exception>
using namespace std;

// Base Class
class RailwayException : public exception
{
protected:
    string message;

public:
    RailwayException(const string &msg) : message(msg) {}
    const char *what() const noexcept override
    {
        return message.c_str();
    }
};

// Derived Exception Classes
class TrainFullException : public RailwayException
{
public:
    TrainFullException() : RailwayException("Train is full. No seats available.") {}
};

class InvalidSeatNumberException : public RailwayException
{
public:
    InvalidSeatNumberException() : RailwayException("Invalid seat number.") {}
};

class BookingFailedException : public RailwayException
{
public:
    BookingFailedException() : RailwayException("Ticket booking failed.") {}
};

class CancellationFailedException : public RailwayException
{
public:
    CancellationFailedException() : RailwayException("Ticket cancellation failed.") {}
};

// Train Class
class Train
{
private:
    vector<string> seats; // empty = available

public:
    Train(int totalSeats) : seats(totalSeats, "") {}

    void bookTicket(const string &passengerName, int seatNumber)
    {
        if (seatNumber < 1 || seatNumber > seats.size())
            throw InvalidSeatNumberException();

        bool full = true;
        for (const auto &s : seats)
            if (s.empty())
                full = false;

        if (full)
            throw TrainFullException();

        if (!seats[seatNumber - 1].empty())
            throw BookingFailedException();

        seats[seatNumber - 1] = passengerName;
        cout << "Ticket booked for " << passengerName
             << " at seat " << seatNumber << endl;
    }

    void cancelTicket(const string &passengerName)
    {
        for (auto &s : seats)
        {
            if (s == passengerName)
            {
                s = "";
                cout << "Ticket cancelled for " << passengerName << endl;
                return;
            }
        }
        throw CancellationFailedException();
    }

    void displaySeats() const
    {
        cout << "\nSeat Status:\n";
        for (size_t i = 0; i < seats.size(); ++i)
        {
            cout << "Seat " << i + 1 << ": ";
            if (seats[i].empty())
                cout << "Available\n";
            else
                cout << "Booked by " << seats[i] << endl;
        }
    }
};

// Main Function
int main()
{
    Train train(3); // Resource managed via RAII

    try
    {
        try
        {
            train.bookTicket("Aditya", 1);
            train.bookTicket("Rahul", 2);
            train.bookTicket("Amit", 5); // Invalid seat
        }
        catch (const InvalidSeatNumberException &e)
        {
            cout << "Error: " << e.what() << endl;
        }

        try
        {
            train.bookTicket("Neha", 3);
            train.bookTicket("Riya", 3); // Booking failed
        }
        catch (const RailwayException &e)
        {
            cout << "Booking Error: " << e.what() << endl;
        }

        train.displaySeats();

        try
        {
            train.cancelTicket("Suresh"); // No booking
        }
        catch (const CancellationFailedException &e)
        {
            cout << "Cancellation Error: " << e.what() << endl;
        }
    }
    catch (const RailwayException &e)
    {
        cout << "Railway Exception: " << e.what() << endl;
    }
    catch (...)
    {
        cout << "Unknown exception occurred." << endl;
    }

    return 0;
}
