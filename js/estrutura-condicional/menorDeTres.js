const readline = require("readline-sync");

const A = Number(readline.question("Primeiro valor: "));
const B = Number(readline.question("Segundo valor: "));
const C = Number(readline.question("Terceiro valor: "));

let menor = 0;

if (A <= B && A <= C) {
    menor = A;
} else {
    if (B <= A && B <= C) {
        menor = B;
    } else {
        menor = C;
    }
}

console.log(`MENOR = ${menor}`);