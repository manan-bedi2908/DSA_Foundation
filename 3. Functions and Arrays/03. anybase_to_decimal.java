#include <iostream>
using namespace std;
int anyBasetoDec(int n, int b) 
{
    int pow = 1;
    int res = 0;
    while (n > 0) {
        int rem = n % 10;
        res += rem*pow;
        pow *= b;
        n = n / 10;
    }
    return res;
}
int main()
{
    int n; 
    int b;
    cin >> n;
    cin >> b;
    int r = anyBasetoDec(n, b);
    cout << r;
    return 0;
}