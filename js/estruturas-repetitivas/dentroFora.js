const readline = require('readline-sync');

let dentro = 0;
let fora = 0;

const X = Number(readline.question("Quantos numeros voce vai digitar? "));
for (let i = 1; i <= X; i++) {
    let num = Number(readline.question("Digite um numero: "));

    if (num >= 10 && num <= 20) {
        dentro++;
    } else {
        fora++;
    }
}

console.log(`${dentro} DENTRO`);
console.log(`${fora} FORA`);