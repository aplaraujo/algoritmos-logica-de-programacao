#include <iostream>
#include <iomanip>
#include <string>
#include <climits>
#include <cmath>

using namespace std;
int main() {

    int i, j, N, quant;

    quant = 0;

    cout << "Qual a ordem da matriz? ";
    cin >> N;

    int** mat = new int*[N];
    for (i = 0; i < N; i++)
        mat[i] = new int[N];

    for (i = 0; i < N; i++)
    {
        for (j = 0; j < N; j++)
        {
            cout << "Elemento [" << i << "," << j << "]: ";
            cin >> mat[i][j];
        }
        
    }

    for (i = 0; i < N; i++)
    {
        for (j = 0; j < N; j++)
        {
            if (mat[i][j] < 0)
            {
                quant++;
            }
            
        }
        
    }
    
    cout << "DIAGONAL PRINCIPAL:" << endl;

    for (i = 0; i < N; i++)
    {
        for (j = 0; j < N; j++)
        {
            if (i == j)
            {
                cout << mat[i][j] << " ";
            }
            
        }
    }

    cout << "\n";

    cout << "QUANTIDADE DE NEGATIVOS = " << quant << endl;

    return 0;
}