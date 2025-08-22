x: int
y: int
i: int
aux: int
soma: int

soma = 0

print("Digite dois numeros:")
x = int(input())
y = int(input())

if x > y:
    aux = x
    x = y
    y = aux

for i in range (x+1, y):
    if i % 2 != 0:
        soma = soma + i

print(f"SOMA DOS IMPARES = {soma}")