#include <iostream>
using namespace std;

int main() {
    int num, sum = 0, temp;

    cout << "Enter a number: ";
    cin >> num;

    temp = num;

    while (temp > 0) {
        sum += temp % 10;
        temp /= 10;
    }

    if (sum % 9 == 0)
        cout << num << " is divisible by 9";
    else
        cout << num << " is not divisible by 9";

    return 0;
}
