#include <iostream>
#include <iomanip>
#include <string>
#include <climits>
#include <cmath>

using namespace std;
int main() {

    int a, b, c, menor;

    cout << "Primeiro valor: ";
    cin >> a;
    cout << "Segundo valor: ";
    cin >> b;
    cout << "Terceiro valor: ";
    cin >> c;

    menor = 0;

    if (a < b && a < c)
    {
        menor = a;
    }
    else if (b < a && b < c)
    {
        menor = b;
    }
    else
    {
        menor = c;
    }
    
    cout << "MENOR = " << menor << endl;

    return 0;
}