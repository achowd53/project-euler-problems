#include <iostream>
using namespace std;

long int gcd(long int a, long int b) {
    if (b == 0) return a;
    return gcd(b, a%b);
};

long int lcm(long int a, long int b) {
    if (a%b == 0) return a;
    return a*b/gcd(a,b);
}

int main() {
    long int ans = 1;
    for (long int i = 2; i <= 20; i++) {
        ans = lcm(ans, i);
    };
    cout << ans;
}