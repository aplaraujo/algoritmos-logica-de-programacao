const readline = require('readline-sync');

console.log("Digite dois numeros: ");
let X = Number(readline.question());
let Y = Number(readline.question());

do {
    if (X < Y) {
        console.log("CRESCENTE!");
    } else {
        console.log("DECRESCENTE!");
    }
    console.log("Digite outros dois numeros: ");
    X = Number(readline.question());
    Y = Number(readline.question());
} while (X !== Y && Y !== X);