import * as readlineSync from 'readline-sync';   

const X: number = Number(readlineSync.question("Quantos numeros voce vai digitar? "));
const numeros: number[] = [];

for (let i = 0; i < X; i++) {
    const num: number = Number(readlineSync.question("Digite um numero: "));
    numeros.push(num);
}

console.log("NUMEROS NEGATIVOS:");

for (let i = 0; i < X; i++) {
    if (numeros[i] < 0) {
        console.log(numeros[i]);
    }
}