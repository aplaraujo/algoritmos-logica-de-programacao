const readline = require("readline-sync");

const n1 = Number(readline.question("Digite a primeira nota: "));
const n2 = Number(readline.question("Digite a segunda nota: "));
const nota = n1 + n2;

console.log(`NOTA FINAL = ${nota.toFixed(1)}`);

if (nota < 60) {
    console.log("REPROVADO");
} 