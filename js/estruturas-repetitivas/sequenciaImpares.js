const readline = require('readline-sync');

const X = Number(readline.question("Digite o valor de X: "));

for (let i = 1; i <= X; i++) {
    if (i % 2 !== 0) {
        console.log(i);
    }
}