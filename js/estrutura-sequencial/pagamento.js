const readline = require('readline-sync');

const nome = readline.question("Nome: ");
const valorHora = Number(readline.question("Valor por hora: "));
const horas = Number(readline.question("Horas trabalhadas: "));

const salario = horas * valorHora;

console.log(`O pagamento para ${nome} deve ser ${salario.toFixed(2)}`);