#include <iostream>
using namespace std;

int main() {
    const double COKE_PRICE = 1.25;
    const double PEPSI_PRICE = 1.50;
    const double WATER_PRICE = 0.75;

    double amountPaid;
    int choice;

    cout << "Welcome to the Drink Vending Machine!" << endl;
    cout << "1. Coke ($" << COKE_PRICE << ")" << endl;
    cout << "2. Pepsi ($" << PEPSI_PRICE << ")" << endl;
    cout << "3. Water ($" << WATER_PRICE << ")" << endl;

    cout << "Enter your choice (1/2/3): ";
    cin >> choice;

    if (choice == 1) {
        cout << "You selected Coke. Please enter the amount you're paying: $";
        cin >> amountPaid;

        if (amountPaid >= COKE_PRICE) {
            double change = amountPaid - COKE_PRICE;
            cout << "Enjoy your Coke! Your change: $" << change << endl;
        } else {
            cout << "Insufficient funds. Please insert more money." << endl;
        }
    } else if (choice == 2) {
        // Similar logic for Pepsi
    } else if (choice == 3) {
        // Similar logic for Water
    } else {
        cout << "Invalid choice. Please select 1, 2, or 3." << endl;
    }

    return 0;
}
