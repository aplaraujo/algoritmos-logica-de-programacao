import * as readlineSync from 'readline-sync';  

const X: number = Number(readlineSync.question("Quantos numeros voce vai digitar? "));
const A:number[] = [];
const B:number[] = [];
const C:number[] = [];
let i:number;

console.log("Digite os valores do vetor A:");
for(i = 0; i < X; i++) {
    const num = Number(readlineSync.question());
    A.push(num);
}

console.log("Digite os valores do vetor B:");
for(i = 0; i < X; i++) {
    const num = Number(readlineSync.question());
    B.push(num);
}

for(i = 0; i < X; i++) {
    C[i] = A[i] + B[i];
}

console.log("VETOR RESULTANTE:");
for(i = 0; i < X; i++) {
    console.log(C[i]);
}