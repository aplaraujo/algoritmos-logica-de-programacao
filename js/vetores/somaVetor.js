const readline = require('readline-sync');

const X = Number(readline.question("Quantos numeros voce vai digitar? "));
const numeros = [];

let soma = 0;

for (let i = 0; i < X; i++) {
    const num = Number(readline.question("Digite um numero: "));   
    numeros.push(num);
}

for (let i = 0; i < X; i++) {
    soma += numeros[i];
}

const media = soma / X;

console.log(`VALORES = ${numeros.join(" ")}`);
console.log(`SOMA = ${soma.toFixed(2)}`);
console.log(`MEDIA = ${media.toFixed(2)}`);