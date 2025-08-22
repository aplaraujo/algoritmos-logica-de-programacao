using System;
using System.Globalization;

CultureInfo CI = CultureInfo.InvariantCulture;

double salario;

Console.WriteLine("Digite um salario: ");
salario = double.Parse(Console.ReadLine(), CI);

Console.WriteLine(salario.ToString("F2", CI));
