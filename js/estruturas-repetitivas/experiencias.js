const readline = require('readline-sync');

const X = Number(readline.question("Quantos casos de teste serao digitados? "));
let coelho = 0;
let rato = 0;
let sapo = 0;

for (let i = 1; i <= X; i++) {
    let quant = Number(readline.question("Quantidade de cobaias: "));
    let cobaia = readline.question("Tipo de cobaia: ");

    if (cobaia === 'C') {
        coelho += quant;
    }

    if (cobaia === 'R') {
        rato += quant;
    }

    if (cobaia === 'S') {
        sapo += quant;
    }
}

const total = coelho + rato + sapo;
const percentualCoelho = (coelho / total) * 100;
const percentualRato = (rato / total) * 100;
const percentualSapo = (sapo / total) * 100;

console.log("RELATORIO FINAL:");
console.log(`Total: ${total} cobaias`);
console.log(`Total de coelhos: ${coelho}`);
console.log(`Total de ratos: ${rato}`);
console.log(`Total de sapos: ${sapo}`);
console.log(`Percentual de coelhos: ${percentualCoelho.toFixed(2)}`);
console.log(`Percentual de ratos: ${percentualRato.toFixed(2)}`);
console.log(`Percentual de sapos: ${percentualSapo.toFixed(2)}`);