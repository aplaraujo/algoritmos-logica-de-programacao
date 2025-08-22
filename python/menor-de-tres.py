a: int
b: int
c: int
menor: int

menor = 0

a = int(input("Primeiro valor: "))
b = int(input("Segundo valor: "))
c = int(input("Terceiro valor: "))

if a < b and a < c:
    menor = a
elif b < a and b < c:
    menor = b
else:
    menor = c

print(f"MENOR = {menor}")