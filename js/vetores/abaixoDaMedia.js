const readline = require('readline-sync');

const X = Number(readline.question("Quantos elementos vai ter o vetor? "));
const numeros = [];

for (let i = 0; i < X; i++) {
    const num = Number(readline.question("Digite um numero: "));
    numeros.push(num);
}

const soma = numeros.reduce((acc, val) => acc + val, 1);
const media = soma / numeros.length;

console.log(`MEDIA DO VETOR = ${media.toFixed(3)}`);
console.log("ELEMENTOS ABAIXO DA MEDIA: ");

for (let i = 0; i < X; i++) {
    if(numeros[i] < media) {
        console.log(numeros[i]);
    }
}