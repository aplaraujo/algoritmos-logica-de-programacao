import * as readlineSync from 'readline-sync';  

const prod1Code: number = Number(readlineSync.question("Digite o codigo do produto 1: "));
const prod1Quant: number = Number(readlineSync.question("Digite a quantidade do produto 1: "));
const prod1Price: number = Number(readlineSync.question("Digite o preco do produto 1: "));
const prod2Code: number = Number(readlineSync.question("Digite o codigo do produto 2: "));
const prod2Quant: number = Number(readlineSync.question("Digite a quantidade do produto 2: "));
const prod2Price: number = Number(readlineSync.question("Digite o preco do produto 2: "));

const total: number = (prod1Quant * prod1Price) + (prod2Quant * prod2Price);

console.log(`VALOR A PAGAR: R$ ${total.toFixed(2)}`);