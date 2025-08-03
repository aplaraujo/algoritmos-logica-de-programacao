import * as readlineSync from 'readline-sync';   

const X: number = Number(readlineSync.question("Quantos numeros voce vai digitar? "));
const numeros: number[] = [];
let soma:number = 0;

for (let i = 0; i < X; i++) {
    const num: number = Number(readlineSync.question("Digite um numero: "));
    numeros.push(num);
}

for (let i = 0; i < X; i++) {
    soma += numeros[i];
}

const media:number = soma / X;

console.log(`VALORES = ${numeros.join(" ")}`);
console.log(`SOMA = ${soma.toFixed(2)}`);
console.log(`MEDIA = ${media.toFixed(2)}`);