const readline = require('readline-sync');

const distancia = Number(readline.question("Distancia percorrida: "));
const combustivel = Number(readline.question("Combustivel gasto: "));
const consumo = distancia / combustivel;

console.log(`Consumo medio = ${consumo.toFixed(3)}`);