const readline = require('readline-sync');

const X = Number(readline.question("Quantos valores vai ter cada vetor? "));
const A = [];
const B = [];
const C = [];

console.log("Digite os valores do vetor A:");
for(i = 0; i < X; i++) {
    const num = Number(readline.question());
    A.push(num);
}

console.log("Digite os valores do vetor B:");
for(i = 0; i < X; i++) {
    const num = Number(readline.question());
    B.push(num);
}

for(i = 0; i < X; i++) {
    C[i] = A[i] + B[i];
}

console.log("VETOR RESULTANTE:");
for(i = 0; i < X; i++) {
    console.log(C[i]);
}