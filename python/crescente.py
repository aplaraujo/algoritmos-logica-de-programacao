x: int
y: int

print("Digite dois numeros:")
x = int(input())
y = int(input())

while x != y and y != x:
    if x < y:
        print("CRESCENTE!")
    else:
        print("DECRESCENTE!")

    print("Digite outros dois numeros:")
    x = int(input())
    y = int(input())