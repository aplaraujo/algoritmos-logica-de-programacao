const readline = require('readline-sync');

const X = Number(readline.question("Quantos numeros voce vai digitar? "));

for (let i = 0; i < X; i++) {
    let num = Number(readline.question("Digite um numero: "));
    if (num === 0) {
        console.log("NULO");
    } else {
        if (num < 0 && num % 2 !== 0) {
           console.log("IMPAR NEGATIVO"); 
        } 
        if (num >  0 && num % 2 !== 0) {
            console.log("IMPAR POSITIVO"); 
        }

        if (num < 0 && num % 2 === 0) {
            console.log("PAR NEGATIVO"); 
        }

        if (num > 0 && num % 2 === 0) {
            console.log("PAR POSITIVO"); 
        }
    }
}