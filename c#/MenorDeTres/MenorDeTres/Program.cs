int a, b, c, menor;

menor = 0;

Console.Write("Primeiro valor: ");
a = int.Parse(Console.ReadLine());
Console.Write("Segundo valor: ");
b = int.Parse(Console.ReadLine());
Console.Write("Terceiro valor: ");
c = int.Parse(Console.ReadLine());

if (a < b && a < c)
{
    menor = a;
}
else if (b < a && b < c)
{
    menor = b;  
}
else
{
    menor = c;
}

Console.WriteLine("MENOR = " + menor);