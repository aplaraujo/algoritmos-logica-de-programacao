const readline = require('readline-sync');

const largura = Number(readline.question("Digite a largura do terreno: "));
const comp = Number(readline.question("Digite o comprimento do terreno: "));
const metro= Number(readline.question("Digite o metro quadrado: "));

const area = largura * comp;
const preco = area * metro;

console.log(`Área do terreno: ${area}`);
console.log(`Preço do terreno: R$ ${preco.toFixed(2)}`);
