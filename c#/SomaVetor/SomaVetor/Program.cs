using System.Globalization;

CultureInfo ci = CultureInfo.InvariantCulture;

int N, i;
double soma, media;

soma = 0;

Console.Write("Quantos numeros voce vai digitar? ");
N = int.Parse(Console.ReadLine());

double[] vet = new double[N];

for(i = 0; i < N; i++)
{
    Console.Write("Digite um numero: ");
    vet[i] = double.Parse(Console.ReadLine(), ci);
}

for (i = 0; i < N; i++)
{
    soma += vet[i];
}

Console.Write("VALORES = ");

for (i = 0; i < N; i++)
{
    Console.Write(vet[i].ToString("F1", ci) + " ");
}

media = soma / N;

Console.WriteLine();
Console.WriteLine("SOMA = " + soma.ToString("F2", ci));
Console.WriteLine("MEDIA = " + media.ToString("F2", ci));
