const readline = require('readline-sync');

const X = Number(readline.question("Quantos casos voce vai digitar? "));

for (let i = 0; i < X; i++) {
    console.log("Digite tres numeros: ");
    let n1 = Number(readline.question());
    let n2 = Number(readline.question());
    let n3 = Number(readline.question());
    let media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
    console.log(`MEDIA = ${media.toFixed(1)}`);
}