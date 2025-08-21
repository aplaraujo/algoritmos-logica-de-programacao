#include <iostream>
#include <iomanip>
#include <string>
#include <climits>

using namespace std;
int main()
{
    int M, N, i, j;

    cout << "Quantas linhas vai ter a matriz? ";
    cin >> M;
    cout << "Quantas colunas vai ter a matriz? ";
    cin >> N;

    // Dynamically allocate the matrix
    int** mat = new int*[M];
    for (i = 0; i < M; i++)
        mat[i] = new int[N];

    for (i = 0; i < M; i++)
    {
        for (j = 0; j < N; j++)
        {
            cout << "Elemento [" << i << "," << j << "]: ";
            cin >> mat[i][j];
        }
    }
    cout << endl
         << "MATRIZ DIGITADA:" << endl;
    for (i = 0; i < M; i++)
    {
        for (j = 0; j < N; j++)
        {
            cout << mat[i][j] << " ";
        }
        cout << endl;
    }

    // Free the allocated memory
    for (i = 0; i < M; i++)
        delete[] mat[i];
    delete[] mat;

    return 0;
}