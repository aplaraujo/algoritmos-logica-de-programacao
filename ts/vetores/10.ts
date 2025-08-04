import * as readlineSync from 'readline-sync';   

const X:number = Number(readlineSync.question("Quantas pessoas serao digitadas? "));
const generos:string[] = [];
const alturas:number[] = [];
let quantHomens:number = 0;
let quantMulheres:number  = 0;
let soma: number = 0;

for (let i = 0; i < X; i++) {
   console.log(`Altura da ${i+1}a pessoa: `);
   const altura:number = Number(readlineSync.question());
   alturas.push(altura);
   console.log(`Genero da ${i+1}a pessoa: `);
   const genero:string = readlineSync.question();
   generos.push(genero);
}

for (let i = 0; i < X; i++) {
    if (generos[i] === 'M') {
        quantHomens++;
    } else {
        soma += alturas[i];
        quantMulheres++;
    }
}

let maior:number = alturas[0];
let menor:number = alturas[0];

for (let i = 0; i < X; i++) {
    if (alturas[i] > maior) {
        maior = alturas[i];
    }

    if (alturas[i] < menor) {
        menor = alturas[i];
    }
}

const media:number = soma / quantMulheres;

console.log(`Menor altura = ${menor.toFixed(2)}`);
console.log(`Maior altura = ${maior.toFixed(2)}`);
console.log(`Media das alturas das mulheres = ${media.toFixed(2)}`);
console.log(`Numero de homens = ${quantHomens}`);