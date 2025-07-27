const readline = require('readline-sync');

const raio = Number(readline.question("Digite o valor do raio do circulo: "));
const area = 3.14159 * Math.pow(raio, 2);

console.log(`AREA = ${area.toFixed(3)}`);