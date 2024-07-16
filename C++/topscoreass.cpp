#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    const int NUM_SCORES = 5; // Number of scores
    vector<double> scores(NUM_SCORES);

    cout << "Enter " << NUM_SCORES << " scores:" << endl;
    for (int i = 0; i < NUM_SCORES; ++i) {
        cout << "Score " << i + 1 << ": ";
        cin >> scores[i];
    }

    // Sort the scores in descending order
    sort(scores.begin(), scores.end(), greater<double>());

    double sumTop4 = 0.0;
    for (int i = 0; i < 4; ++i) {
        sumTop4 += scores[i];
    }

    double averageTop4 = sumTop4 / 4.0;
    cout << "Average of the top 4 scores: " << averageTop4 << endl;

    return 0;
}
