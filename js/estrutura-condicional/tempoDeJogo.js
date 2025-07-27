const readline = require("readline-sync");

const horaInicial = Number(readline.question("Hora inicial: "));
const horaFinal = Number(readline.question("Hora final: "));
let total;

if (horaFinal < horaInicial) {
    total = (24 - horaInicial) + horaFinal;
} else {
    if (horaFinal > horaInicial) {
        total = horaFinal - horaInicial;
    } else {
        total = 24;
    }
}

console.log(`O JOGO DUROU ${total} HORA(S)`);