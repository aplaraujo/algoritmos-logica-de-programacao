import * as readlineSync from 'readline-sync';  

const X:number = Number(readlineSync.question("Quantas pessoas serao digitadas? "));
const nomes:string[] = [];
const idades:number[] = [];
const alturas:number[] = [];

for (let i = 1; i <= X; i++) {
    console.log(`Dados da ${i}a pessoa:`);
    let nome = readlineSync.question("Nome: ");
    nomes.push(nome);
    let idade = Number(readlineSync.question("Idade: "));
    idades.push(idade);
    let altura = Number(readlineSync.question("Altura: "));
    alturas.push(altura);
}

const soma = alturas.reduce((altura, val) => altura + val, 1);
const media = soma / X;
const pessoas = nomes.map((n, i) => ({
    nome: n,
    idade: idades[i]
}));
const menos16 = pessoas.filter(pessoa => pessoa.idade < 16);
const percentualMenos16 = (menos16.length / X) * 100;
const pessoasMenos16 = menos16.map(pessoa => pessoa.nome)

console.log();
console.log(`Altura média: ${media.toFixed(2)}`);
console.log(`Pessoas com menos de 16 anos: ${percentualMenos16.toFixed(2)}%`);
console.log(pessoasMenos16);