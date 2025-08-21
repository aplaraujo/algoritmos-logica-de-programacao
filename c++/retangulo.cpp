#include <iostream>
#include <iomanip>
#include <string>
#include <climits>
#include <cmath>

using namespace std;
int main() {

    double base, altura, area, perimetro, diagonal;

    cout << "Base do retangulo: ";
    cin >> base;
    cout << "Altura do retangulo: ";
    cin >> altura;

    area = base * altura;
    perimetro = 2 * (base + altura);
    diagonal = sqrt(powf(base, 2) + powf(altura, 2));

    cout << "AREA = " << fixed << setprecision(4) << area << endl;
    cout << "PERIMETRO = " << fixed << setprecision(4) << perimetro << endl;
    cout << "DIAGONAL = " << fixed << setprecision(4) << diagonal << endl;

    return 0;
}