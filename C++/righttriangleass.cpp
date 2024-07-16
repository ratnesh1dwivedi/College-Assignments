#include <iostream>
using namespace std;

int main() {
    double side1, side2, side3;

    cout << "Enter the lengths of three sides of the triangle:" << endl;
    cout << "Side 1: ";
    cin >> side1;
    cout << "Side 2: ";
    cin >> side2;
    cout << "Side 3: ";
    cin >> side3;

    // Check the Pythagorean theorem
    if (side1 * side1 + side2 * side2 == side3 * side3 ||
        side2 * side2 + side3 * side3 == side1 * side1 ||
        side1 * side1 + side3 * side3 == side2 * side2) {
        cout << "The triangle with sides " << side1 << ", " << side2 << ", and " << side3 << " is a right triangle." << endl;
    } else {
        cout << "The triangle with sides " << side1 << ", " << side2 << ", and " << side3 << " is not a right triangle." << endl;
    }

    return 0;
}
