#include <iostream>

using namespace std;

int f (int a) {
    return a << 1;
}

int main () {
    int n, sum1 = 0;
    cin >> n;

    for (int i = 0; i < n; ++i)
        sum1 += i;

    for (int i = 0; i < n; ++i) {
        sum1 += i;
    }

    int sum2 = 0, sum3 = 0, sum4 = 1;
    for (int i = 1; i < n; ++i) {
        sum2 -= f(i);
        sum3 += 2 * i + i * i + f(i);
        sum4 *= i;
    }

    int tmp = 0;
    for (int i = 0; i < 10; ++i) {
        for (int j = 0; j < 10; ++j) {
            tmp += j;
        }
    }

    cout << sum1 << ' ' << sum2 << ' ' << sum3 << ' ' << sum4 << ' ' << tmp << endl;
}