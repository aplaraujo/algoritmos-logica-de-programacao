const readline = require('readline-sync');

let X = Number(readline.question("Digite um numero: "));

while (X > 0) {
    if (X % 2 === 1) {
        X++
    }

    let soma = 0;
    let atual = X;
    let i = 0;

    while (i < 5) {
        soma += atual;
        atual += 2;
        i++;
    }
    console.log(`SOMA = ${soma}`);

    X = Number(readline.question("Digite um numero: "));
}