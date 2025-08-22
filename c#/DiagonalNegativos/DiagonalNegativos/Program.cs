int N, i, j, quant;

quant = 0;


Console.Write("Qual a ordem da matriz? ");
N = int.Parse(Console.ReadLine()); 

int[,] mat = new int[N, N];

for(i = 0; i < N; i++)
{
    for(j = 0; j < N; j++)
    {
        Console.Write("Elemento [" + i + "," + j + "]: ");
        mat[i, j] = int.Parse(Console.ReadLine());
    }
}

for (i = 0; i < N; i++)
{
    for (j = 0; j < N; j++)
    {
        if (mat[i, j] < 0)
        {
            quant++;
        }
    }
}

Console.WriteLine("DIAGONAL PRINCIPAL:");

for (i = 0; i < N; i++)
{
    for (j = 0; j < N; j++)
    {
        if (i == j)
        {
            Console.Write(mat[i, j] + " ");
        }
    }
}

Console.WriteLine();
Console.WriteLine("QUANTIDADE DE NEGATIVOS = " + quant);
