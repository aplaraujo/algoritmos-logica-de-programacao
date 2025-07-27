const readline = require("readline-sync");

const X = Number(readline.question("Valor de X: "));
const Y = Number(readline.question("Valor de Y: "));

if (X > 0 && Y > 0) {
    console.log("Q1");
}

if (X < 0 && Y > 0) {
    console.log("Q2");
}

if (X < 0 && Y < 0) {
    console.log("Q3");
}

if (X > 0 && Y < 0) {
    console.log("Q4");
}

if (X > 0 && Y === 0) {
    console.log("Eixo X");
}

if (X < 0 && Y === 0) {
    console.log("Eixo X");
}

if (X  === 0 && Y > 0) {
    console.log("Eixo Y");
}

if (X === 0 && Y < 0) {
    console.log("Eixo Y");
}

if (X === 0 && Y === 0) {
    console.log("Origem");
}