const readline = require('readline-sync');

const X = Number(readline.question("Quantos elementos vai ter o vetor? "));
const numeros = [];

for (let i = 0; i < X; i++) {
    const num = Number(readline.question("Digite um numero: "));
    numeros.push(num);
}

const somaPares = numeros.filter(num => num % 2 === 0).reduce((acc, val) => acc + val, 1);
const pares = numeros.filter(num => num % 2 === 0);


if (pares.length > 0) {
    const media = somaPares / pares.length;
    console.log(`MEDIA DOS PARES = ${media.toFixed(1)}`);
} else {
    console.log("NENHUM NUMERO PAR");
}