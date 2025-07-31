import * as readlineSync from 'readline-sync';   

const raio: number = Number(readlineSync.question("Digite o valor do raio: "));

const area:number = 3.14159 * Math.pow(raio, 2);

console.log(`A=${area.toFixed(4)}`);