const readline = require('readline-sync');

const X = Number(readline.question("Digite o valor de X: "));
const Y = Number(readline.question("Digite o valor de Y: "));
const soma = X + Y;

console.log(`SOMA = ${soma}`);