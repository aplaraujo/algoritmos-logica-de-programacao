import * as readlineSync from 'readline-sync';   

const X: number = Number(readlineSync.question("Quantos elementos vai ter o vetor? "));
const numeros:number[] = [];

for (let i = 0; i < X; i++) {
    const num:number = Number(readlineSync.question("Digite um numero: "));
    numeros.push(num);
}

const somaPares:number = numeros.filter(num => num % 2 === 0).reduce((acc, val) => acc + val, 1);
const pares:number[] = numeros.filter(num => num % 2 === 0);


if (pares.length > 0) {
    const media = somaPares / pares.length;
    console.log(`MEDIA DOS PARES = ${media.toFixed(1)}`);
} else {
    console.log("NENHUM NUMERO PAR");
}