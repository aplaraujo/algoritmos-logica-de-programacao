const readline = require('readline-sync');

console.log("Digite dois numeros:");
let X = Number(readline.question());
let Y = Number(readline.question());

let soma = 0;

if (X > Y) {
   let aux = X;
   X = Y;
   Y = aux; 
}

for (let i = X+1; i < Y; i++) {
    if (i % 2 !== 0) {
        soma += i;
    }
}

console.log(`SOMA DOS IMPARES = ${soma}`);