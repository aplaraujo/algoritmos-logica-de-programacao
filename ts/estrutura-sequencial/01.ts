import * as readlineSync from 'readline-sync';   

const a: number = Number(readlineSync.question("Digite o valor de A: "));
const b: number = Number(readlineSync.question("Digite o valor de B: "));

const soma: number = a + b;

console.log(`SOMA = ${soma}`);