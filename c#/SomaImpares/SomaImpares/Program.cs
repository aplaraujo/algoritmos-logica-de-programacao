int x, y, i, aux, soma;

soma = 0;

Console.WriteLine("Digite dois numeros:");
x = int.Parse(Console.ReadLine());
y = int.Parse(Console.ReadLine());

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
        soma += i;
    }
}

Console.WriteLine("SOMA DOS IMPARES = " + soma);
