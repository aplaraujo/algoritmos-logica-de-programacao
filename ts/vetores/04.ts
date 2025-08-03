import * as readlineSync from 'readline-sync';   

const X: number = Number(readlineSync.question("Quantos numeros voce vai digitar? "));
const numeros: number[] = [];

for (let i = 0; i < X; i++) {
    const num: number = Number(readlineSync.question("Digite um numero: "));
    numeros.push(num);
}

let maior:number = numeros[0];
let posicao:number = 0;

for (let i = 0; i < X; i++) {
    if (numeros[i] > maior) {
        maior = numeros[i];
        posicao = i;
    }
}

console.log(`MAIOR VALOR = ${maior}`);
console.log(`POSICAO DO MAIOR VALOR = ${posicao}`);