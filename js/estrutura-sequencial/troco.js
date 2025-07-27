const readline = require('readline-sync');

const preco = Number(readline.question("Preco unitario do produto: "));
const quant = Number(readline.question("Quantidade comprada: "));
const dinheiro = Number(readline.question("Dinheiro recebido: "));

const total = preco * quant;
const troco = dinheiro - total;

console.log(`TROCO = ${troco.toFixed(2)}`);