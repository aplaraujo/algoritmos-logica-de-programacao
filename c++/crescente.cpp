#include <iostream>
#include <iomanip>
#include <string>
#include <climits>
#include <cmath>

using namespace std;
int main() {
    int x, y;

    cout << "Digite dois numeros: " << endl;
    cin >> x;
    cin >> y;
    do
    {
        if (x < y)
        {
            cout << "CRESCENTE!" << endl; 
        }
        else
        {
            cout << "DECRESCENTE!" << endl;
        }

        cout << "Digite outros dois numeros: " << endl;
        cin >> x;
        cin >> y;
        

    } while (x != y && y != x);
    

    return 0;
}