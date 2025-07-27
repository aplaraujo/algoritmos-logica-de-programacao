const readline = require("readline-sync");

const quantMinutos = Number(readline.question("Digite a quantidade de minutos: "));

if (quantMinutos <= 100) {
   console.log("Valor a pagar: R$ 50.00"); 
} else {
    const excedente = 50 + ((quantMinutos - 100) * 2);
    console.log(`Valor a pagar: R$ ${excedente.toFixed(2)}`);
}