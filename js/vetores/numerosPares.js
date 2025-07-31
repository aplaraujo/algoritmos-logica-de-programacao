const readline = require('readline-sync');

const X = Number(readline.question("Quantos numeros voce vai digitar? "));
const numeros = [];

for (let i = 0; i < X; i++) {
    const num = Number(readline.question("Digite um numero: "));
    numeros.push(num);
}

const pares = numeros.filter(num => num % 2 === 0)

console.log("NUMEROS PARES:");
console.log(pares.join(" "));
console.log(`QUANTIDADE DE PARES = ${pares.length}`);