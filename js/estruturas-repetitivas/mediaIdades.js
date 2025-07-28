const readline = require('readline-sync');

let soma = 0;
let i = 0;

console.log("Digite as idades:");

let idade = Number(readline.question());

if (idade < 0) {
    console.log("IMPOSSIVEL CALCULAR");
} else {
    while (idade > 0) {
        soma += idade;
        idade = Number(readline.question());
        i++;
    }
    const media = soma / i;
    
    console.log(`MEDIA = ${media.toFixed(2)}`);
}
