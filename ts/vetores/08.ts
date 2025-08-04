import * as readlineSync from 'readline-sync';   

const X:number = Number(readlineSync.question("Quantas pessoas serao digitadas? "));
const nomes:string[] = [];
const idades:number[] = [];

let maior:number = 0;
let posicao:number = 0;

for (let i = 1; i <= X; i++) {
    console.log(`Dados da ${i}a pessoa:`);
    let nome = readlineSync.question("Nome: ");
    nomes.push(nome);
    let idade = Number(readlineSync.question("Idade: "));
    idades.push(idade);
}

for (let i = 1; i <= X; i++) {
    if (idades[i] > maior) {
        maior = idades[i];
        posicao = i;
    }
}

console.log(`PESSOA MAIS VELHA: ${nomes[posicao]}`);