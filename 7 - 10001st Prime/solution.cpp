#include <iostream>
using namespace std;

int main() {
    bool numbers[114320] = {}; // nth prime always less than n(ln(n)+ln(ln(n)))
    for (int i = 0; i < 114320; i++) numbers[i] = true;
    int primes_found = 0;
    for (int i = 2; i < 114320; i++) {
        if (numbers[i]) {
            primes_found += 1;
            if (primes_found == 10001) {
                cout << i;
                break;
            }
            for (int multiple = 2 * i; multiple < 114320; multiple += i) {
                numbers[multiple] = false;
            }
        }
    }
}
