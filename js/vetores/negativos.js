const readline = require('readline-sync');

const X = Number(readline.question("Quantos numeros voce vai digitar? "));
const numeros = [];

for (let i = 0; i < X; i++) {
    const num = Number(readline.question("Digite um numero: "));
    numeros.push(num);
}

console.log("NUMEROS NEGATIVOS:");
for (let i = 0; i < X; i++) {
    if (numeros[i] < 0) {
        console.log(numeros[i]);
    }
}