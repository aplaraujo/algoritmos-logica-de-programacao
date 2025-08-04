import * as readlineSync from 'readline-sync';   

const X:number = Number(readlineSync.question("Quantos alunos serao digitados? "));
const nomes:string[] = [];
const nota1:number[] = [];
const nota2:number[] = [];
const media:number[] = [];

for (let i = 0; i < X; i++) {
    console.log(`Digite nome, primeira e segunda nota do ${i+1}o aluno:`);
    const nome: string = readlineSync.question();
    nomes.push(nome);
    const n1:number = Number(readlineSync.question());
    nota1.push(n1);
    const n2:number = Number(readlineSync.question());
    nota2.push(n2);
}

for (let i = 0; i < X; i++) {
    media[i] = (nota1[i] + nota2[i]) / 2;
}

const alunos = nomes.map((n, i) => ({
    nome: n,
    media: media[i]
}));

console.log(alunos);

const aprovacao = alunos.filter(aluno => aluno.media >= 6);
const aprovados = aprovacao.map(aluno => aluno.nome);

console.log("Alunos aprovados:");
for (let i = 0; i < aprovados.length; i++) {
    console.log(aprovados[i]);
}