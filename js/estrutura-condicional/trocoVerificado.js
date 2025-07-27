const readline = require("readline-sync");

const preco = Number(readline.question("Preco unitario do produto: "));
const quant = Number(readline.question("Quantidade comprada: "));
const dinheiro = Number(readline.question("Dinheiro recebido: "));

const total = preco * quant;


if (total < dinheiro) {
    const troco = dinheiro - total;
    console.log(`TROCO = ${troco.toFixed(2)}`);
} else {
    const falta = total - dinheiro;
    console.log(`DINHEIRO INSUFICIENTE. FALTAM ${falta.toFixed(2)} REAIS`);
}
