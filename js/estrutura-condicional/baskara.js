const readline = require("readline-sync");

const A = Number(readline.question("Coeficiente a: "));
const B = Number(readline.question("Coeficiente b: "));
const C = Number(readline.question("Coeficiente c: "));

const delta = Math.pow(B, 2) - (4 * A * C);

if (delta < 0 || delta === 0) {
    console.log("Esta equacao nao possui raizes reais");
} else {
    const X1 = - B + Math.sqrt(delta) / (2 * A);
    const X2 = - B - Math.sqrt(delta) / (2 * A);

    console.log(`X1 = ${X1.toFixed(4)}`);
    console.log(`X2 = ${X2.toFixed(4)}`);
}