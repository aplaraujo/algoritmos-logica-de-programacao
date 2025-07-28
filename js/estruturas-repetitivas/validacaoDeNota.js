const readline = require('readline-sync');


let n1 = Number(readline.question("Digite a primeira nota: "));
do {
    if (n1 < 0 || n1 > 10) {
        n1 = Number(readline.question("Valor invalido! Tente novamente: "));   
    }
} while (n1 < 0 || n1 > 10);

let n2 = Number(readline.question("Digite a segunda nota: "));
do {
    if (n2 < 0 || n2 > 10) {
        n2 = Number(readline.question("Valor invalido! Tente novamente: "));   
    }
} while (n2 < 0 || n2 > 10);

const media = (n1 + n2) / 2;

console.log(`MEDIA = ${media.toFixed(2)}`);