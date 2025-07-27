const readline = require("readline-sync");

const codigo = Number(readline.question("Codigo do produto comprado: "));
const quant = Number(readline.question("Quantidade comprada: "));
let total;

switch (codigo) {
    case 1:
        total = quant * 5.00;
        break;
    case 2:
        total = quant * 3.50;
        break;
    case 3:
        total = quant * 4.80;
        break;
    case 4:
        total = quant * 8.90;
        break;
    case 5:
        total = quant * 7.32;
        break;
    default:
        console.log("Opcao inválida!!!");
        break;
}

console.log(`Valor a pagar: R$ ${total.toFixed(2)}`);