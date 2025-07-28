const readline = require('readline-sync');

console.log("Digite os valores das coordenadas X e Y:");
let X = Number(readline.question());
let Y = Number(readline.question());

do {
    if (X > 0 && Y > 0) {
        console.log("QUADRANTE Q1");
    }

    if (X < 0 && Y > 0) {
        console.log("QUADRANTE Q2");
    }

    if (X < 0 && Y < 0) {
        console.log("QUADRANTE Q3");
    }

    if (X > 0 && Y < 0) {
        console.log("QUADRANTE Q4");
    }
    console.log("Digite os valores das coordenadas X e Y:");
    X = Number(readline.question());
    Y = Number(readline.question());
} while (X !== 0 && Y !== 0);