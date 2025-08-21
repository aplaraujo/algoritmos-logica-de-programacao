#include <iostream>
#include <iomanip>
#include <string>
#include <climits>
#include <cmath>

using namespace std;
int main() {
    int x, y, aux, soma, i;

    soma = 0;

    cout << "Digite dois numeros: " << endl;
    cin >> x;
    cin >> y;

    if (x > y)
    {
        aux = x;
        x = y;
        y = aux;
    }

    for (i = x+1; i < y; i++)
    {
        if (i % 2 != 0)
        {
            soma = soma + i;
        }
        
    }
    
    cout << "SOMA DOS IMPARES = " << soma << endl;

    return 0;
}