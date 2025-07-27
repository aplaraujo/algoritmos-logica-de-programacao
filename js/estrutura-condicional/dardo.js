const readline = require("readline-sync");

console.log("Digite as tres distancias: ");
const A = Number(readline.question());
const B = Number(readline.question());
const C = Number(readline.question());

let maior = 0;

if (A >= B && A >= C) {
    maior = A;
} else {
    if (B >= A && B >= C) {
        maior = B;
    } else {
        maior = C;
    }
}

console.log(`MAIOR DISTANCIA = ${maior}`);