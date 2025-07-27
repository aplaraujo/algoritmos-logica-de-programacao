const readline = require("readline-sync");

const salario = Number(readline.question("Digite o salario da pessoa: "));
let aumento;
let novoSalario;
let porcentagem;

if (salario <= 1000) {
    aumento = salario * 0.20;
    novoSalario = salario + aumento;
    porcentagem = 20;
} else {
    if (salario > 1000 && salario <= 3000) {
       aumento = salario * 0.15;
       novoSalario = salario + aumento;
       porcentagem = 15; 
    } else {
        if (salario > 3000 && salario <= 8000) {
            aumento = salario * 0.10;
            novoSalario = salario + aumento;
            porcentagem = 10;
        } else {
            aumento = salario * 0.05;
            novoSalario = salario + aumento;
            porcentagem = 5;
        }
    }
}

console.log(`Novo salario = R$ ${novoSalario.toFixed(2)}`);
console.log(`Aumento = R$ ${aumento.toFixed(2)}`);
console.log(`Porcentagem = ${porcentagem} %`);