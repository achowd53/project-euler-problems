#include <iostream>
#include <string>
using namespace std;

int main(int argc, char const *argv[])
{
    int i, j, ans;
    bool isPal;
    for (int a = 999; a > 0; a--) {
        for (int b = 999; b > 0; b--) {
            string palindrome = to_string(a*b);
            i = 0;
            j = palindrome.length() - 1;
            isPal = true;
            while (i < j) {
                if (palindrome.at(i) != palindrome.at(j)) {
                    isPal = false;
                    break;
                };
                i++;
                j--;
            };
            if (isPal) ans = max(stoi(palindrome), ans);
        };
    };
    cout << ans;
    return 0;
}
