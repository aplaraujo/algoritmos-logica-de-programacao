const readline = require("readline-sync");

console.log("Digite dois numeros inteiros: ");
const A = Number(readline.question());
const B = Number(readline.question());

if (A > B) {
    if (A % B === 0) {
        console.log("Sao multiplos");
    } else {
        console.log("Nao sao multiplos");
    }
} else {
    if (B % A == 0) {
        console.log("Sao multiplos");
    } else {
        console.log("Nao sao multiplos");
    }
}