const readline = require('readline-sync');

let fat = 1;

const N = Number(readline.question("Digite o valor de N: "));

for (let i = 1; i <= N; i++) {
    fat *= i;
}

console.log(`FATORIAL = ${fat}`);