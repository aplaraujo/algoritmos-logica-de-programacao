const readline = require('readline-sync');

let alcool = 0;
let gasolina = 0;
let diesel = 0;

let codigo = Number(readline.question("Informe um codigo (1, 2, 3) ou 4 para parar: "));

do {
    if (codigo === 1) {
        alcool++;
    } 
    if (codigo === 2) {
        gasolina++;
    }
    if (codigo === 3) {
        diesel++;
    }
    codigo = Number(readline.question("Informe um codigo (1, 2, 3) ou 4 para parar: "));
}while (codigo !== 4)

console.log("MUITO OBRIGADO");
console.log(`Alcool: ${alcool}`);
console.log(`Gasolina: ${gasolina}`);
console.log(`Diesel: ${diesel}`);