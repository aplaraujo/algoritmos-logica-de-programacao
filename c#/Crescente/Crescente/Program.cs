int x, y;

Console.WriteLine("Digite dois numeros:");
x = int.Parse(Console.ReadLine());  
y = int.Parse(Console.ReadLine());

do
{
    if (x < y)
    {
        Console.WriteLine("CRESCENTE!");
    }
    else
    {
        Console.WriteLine("DECRESCENTE!");
    }

    Console.WriteLine("Digite outros dois numeros:");
    x = int.Parse(Console.ReadLine());
    y = int.Parse(Console.ReadLine());
}
while (x != y && y != x);
