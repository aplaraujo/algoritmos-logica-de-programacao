N: int
i: int
soma: float
media: float

soma = 0

N = int(input("Quantos numeros voce vai digitar? "))

vet: [float] = [0 for x in range(N)]

for i in range(0, N):
    vet[i] = float(input("Digite um numero: "))

for i in range(0, N):
    soma = soma + vet[i]

media = soma / N

print()
print("VALORES = ", end=" ")

for i in range(0, N):
    print(f"{vet[i]} ", end=" ")

print()
print(f"SOMA = {soma:.2f}")
print(f"MEDIA = {media:.2f}")