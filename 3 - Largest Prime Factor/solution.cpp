#include <iostream>
using namespace std;

int main(int argc, char const *argv[])
{
    long long int x = 600851475143;
    long long int i = 2;
    while (i != x) {
        if (x%i == 0) {
            x /= i;
            i = 2;
        }
        else {
            i += 1;
        };
    };
    cout << x;
    return 0;
}
