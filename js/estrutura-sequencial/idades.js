const readline = require('readline-sync');

console.log("Dados da primeira pessoa: ");
const nome1 = readline.question("Nome: ");
const idade1 = Number(readline.question("Idade: "));

console.log("Dados da segunda pessoa: ");
const nome2 = readline.question("Nome: ");
const idade2 = Number(readline.question("Idade: "));

const media = (idade1 + idade2) / 2;

console.log(`A idade média de ${nome1} e ${nome2} e de ${media} anos`);