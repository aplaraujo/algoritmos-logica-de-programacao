import * as readlineSync from 'readline-sync';   

const num: number = Number(readlineSync.question("Digite o numero do funcionario: "));
const hours: number = Number(readlineSync.question("Digite as horas trabalhadas: "));
const value: number = Number(readlineSync.question("Digite o valor por hora: "));

const salary: number = hours * value;

console.log(`NUMBER = ${num}`);
console.log(`SALARY = U$ ${salary.toFixed(2)}`);