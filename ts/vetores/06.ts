import * as readlineSync from 'readline-sync';   

const X: number = Number(readlineSync.question("Quantos elementos vai ter o vetor? "));
const numeros:number[] = [];

for (let i = 0; i < X; i++) {
    const num:number = Number(readlineSync.question("Digite um numero: "));
    numeros.push(num);
}


const soma:number = numeros.reduce((acc, val) => acc + val, 1);
const media:number = soma / X;

console.log(`MEDIA DO VETOR = ${media.toFixed(3)}`);
console.log("ELEMENTOS ABAIXO DA MEDIA: ");

for (let i = 0; i < X; i++) {
    if(numeros[i] < media) {
        console.log(numeros[i]);
    }
}