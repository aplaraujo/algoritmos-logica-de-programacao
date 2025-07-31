import * as readlineSync from 'readline-sync';   

const option:number = Number(readlineSync.question());
const quant:number = Number(readlineSync.question());
let total: number = 0;

switch (option) {
    case 1:
        total = quant * 4.00
        break;
    case 2:
        total = quant * 4.50
        break;
    case 3:
        total = quant * 5.00
        break;
    case 4:
        total = quant * 2.00
        break;
    case 5:
        total = quant * 1.50
        break;
    default:
        console.log("Opção inválida!");
        break;
}

console.log(`Total: R$ ${total.toFixed(2)}`);