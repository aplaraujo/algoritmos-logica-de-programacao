const readline = require('readline-sync');

const duracao = Number(readline.question("Digite a duracao em segundos: "));

const hora = duracao / 3600;
const resto = duracao % 3600;
const minuto = resto / 60;
const segundo = resto % 60;

console.log(`${hora.toFixed(0)}:${minuto.toFixed(0)}:${segundo.toFixed(0)}`);