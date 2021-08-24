#include <iostream>
using namespace std;

int main()
{
    int three = 3;
    int five = 5;
    int sum = 0;
    while (three < 1000) {
        if (three % 5 != 0) sum += three;
        three += 3;
    };
    while (five < 1000) {
        sum += five;
        five += 5;
    };
    cout << sum;
    return 0;
}
