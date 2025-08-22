N: int
i: int
j: int
quant: int

quant = 0

N = int(input("Qual a ordem da matriz? "))

mat: [[int]] = [[0 for x in range(N)] for x in range(N)]

for i in range(0, N):
    for j in range(0, N):
        mat[i][j] = int(input(f"Elemento [{i},{j}]: "))

for i in range(0, N):
    for j in range(0, N):
        if mat[i][j] < 0:
            quant = quant + 1

print("DIAGONAL PRINCIPAL: ")

for i in range(0, N):
    for j in range(0, N):
        if(i == j):
            print(f"{mat[i][j]}", end=" ")

print()
print(f"QUANTIDADE DE NEGATIVOS = {quant}")