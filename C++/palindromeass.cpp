#include <iostream>

int main() {
    int originalNumber, reversedNumber = 0, remainder, temp;

    std::cout << "Enter a five-digit integer: ";
    std::cin >> originalNumber;

    temp = originalNumber; // Store the original number in a temporary variable

    // Reversing the number
    while (temp > 0) {
        remainder = temp % 10;
        reversedNumber = reversedNumber * 10 + remainder;
        temp /= 10;
    }

    // Checking if the reversed number is equal to the original number
    if (reversedNumber == originalNumber) {
        std::cout << originalNumber << " is a palindrome." << std::endl;
    } else {
        std::cout << originalNumber << " is not a palindrome." << std::endl;
    }

    return 0;
}
