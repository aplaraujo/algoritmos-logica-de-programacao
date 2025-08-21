#include <iostream>
#include <iomanip>
#include <string>
#include <climits>
#include <cmath>

using namespace std;
int main() {

    int N, i;
    double soma, soma16, media, porc;

    cout << "Quantas pessoas serao digitadas? ";
    cin >> N;

    int* idades = new int[N];
    string* nomes = new string[N];
    double* alturas = new double[N];

    for (i = 0; i < N; i++)
    {
        cout << "Dados da " << i+1 << "a pessoa: " << endl;
        cout << "Nome: ";
        cin.ignore(INT_MAX, '\n');
        getline(cin, nomes[i]);
        cout << "Idade: ";
        cin >> idades[i];
        cout << "Altura: ";
        cin >> alturas[i];

        soma += alturas[i];
    }
    
    for (i = 0; i < N; i++) {
        if (idades[i] < 16)
        {
            soma16++;
        }
        
    }

    media = soma / N;
    porc = (soma16 / N) * 100;

    cout << "Altura média: " << fixed << setprecision(2) << media << endl;
    cout << "Pessoas com menos de 16 anos: " << fixed << setprecision(1) << porc << "%" << endl;

    for (i = 0; i < N; i++) {
        if(idades[i] < 16) {
            cout << nomes[i] << endl;
        }
    }

    return 0;
}