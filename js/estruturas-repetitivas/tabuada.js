const readline = require('readline-sync');

const N = Number(readline.question("Deseja a tabuada para qual valor? "));

for (let i = 1; i <= 10; i++) {
    console.log(`${N} x ${i} = ${N * i}`);
}