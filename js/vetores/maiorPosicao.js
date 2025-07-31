const readline = require('readline-sync');

const X = Number(readline.question("Quantos numeros voce vai digitar? "));
const numeros = [];

for (let i = 0; i < X; i++) {
    const num = Number(readline.question("Digite um numero: "));
    numeros.push(num);
}

let maior = numeros[0];
let posicao = 0;

for (let i = 0; i < X; i++) {
    if (numeros[i] > maior) {
        maior = numeros[i];
        posicao = i;
    }
}

console.log(`MAIOR VALOR = ${maior}`);
console.log(`POSICAO DO MAIOR VALOR = ${posicao}`);