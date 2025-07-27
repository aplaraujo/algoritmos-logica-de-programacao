const readline = require('readline-sync');

const base = Number(readline.question("Base do retangulo: "));
const altura = Number(readline.question("Altura do triangulo: "));

const area = base * altura;
const perimetro = 2 * (base * altura);
const diagonal = Math.sqrt((base * base) + (altura * altura));

console.log(`AREA = ${area}`);
console.log(`PERIMETRO = ${perimetro}`);
console.log(`DIAGONAL = ${diagonal.toFixed(4)}`);