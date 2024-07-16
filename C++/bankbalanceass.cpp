#include <iostream>
using namespace std;

int main() {
    double balance = 0.0;
    
    cout << "Enter your initial account balance: $";
    cin >> balance;
    
    double withdrawAmount, depositAmount;
    
    cout << "Enter the amount you want to withdraw: $";
    cin >> withdrawAmount;
    
    if (withdrawAmount > balance) {
        cout << "Insufficient balance for withdrawal." << endl;
    } else {
        balance -= withdrawAmount;
        cout << "Amount withdrawn. New balance: $" << balance << endl;
    }
    
    cout << "Enter the amount you want to deposit: $";
    cin >> depositAmount;
    
    balance += depositAmount;
    cout << "Amount deposited. New balance: $" << balance << endl;
    
    return 0;
}
