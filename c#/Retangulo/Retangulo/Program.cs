using System.Globalization;

CultureInfo ci = CultureInfo.InvariantCulture;

double baseRetangulo, alturaRetangulo, area, perimetro, diagonal;

Console.Write("Base do retangulo: ");
baseRetangulo = Double.Parse(Console.ReadLine(), ci);

Console.Write("Altura do retangulo: ");
alturaRetangulo = Double.Parse(Console.ReadLine(), ci);

area = baseRetangulo * alturaRetangulo;

perimetro = 2 * (baseRetangulo + alturaRetangulo);

diagonal = Math.Sqrt(Math.Pow(baseRetangulo, 2) + Math.Pow(alturaRetangulo, 2));

Console.WriteLine("AREA = " + area.ToString("F4",  ci));
Console.WriteLine("PERIMETRO = " + perimetro.ToString("F4", ci));
Console.WriteLine("DIAGONAL = " + diagonal.ToString("F4", ci));
