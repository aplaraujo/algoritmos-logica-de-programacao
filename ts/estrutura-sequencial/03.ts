import * as readlineSync from 'readline-sync';   

const a: number = Number(readlineSync.question("Digite o valor de A: "));
const b: number = Number(readlineSync.question("Digite o valor de B: "));
const c: number = Number(readlineSync.question("Digite o valor de C: "));
const d: number = Number(readlineSync.question("Digite o valor de D: "));

const diferenca:number = (a * b) - (c * d);

console.log(`DIFERENCA = ${diferenca}`);