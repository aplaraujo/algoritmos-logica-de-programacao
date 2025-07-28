const readline = require('readline-sync');

const X = Number(readline.question("Quantos casos voce vai digitar? "));

for (let i = 0; i < X; i++) {
    let num = Number(readline.question("Entre com o numerador: "));
    let den = Number(readline.question("Entre com o denominador: "));

    if (den === 0) {
        console.log("DIVISAO IMPOSSIVEL");
    } else {
        let div = num / den;
        console.log(`DIVISAO = ${div.toFixed(2)}`);
    }
}