import * as readlineSync from 'readline-sync';  

const a: number = Number(readlineSync.question("Digite o valor de A: "));
const b: number = Number(readlineSync.question("Digite o valor de B: "));
const c: number = Number(readlineSync.question("Digite o valor de C: "));

const areaTri:number = (a * c) / 2;
const areaCir:number = 3.14159 * (c * c);
const areaTra:number = ((a + b) * c) / 2;
const areaQua:number = b * b;
const areaRet:number = a * b;

console.log(`TRIANGULO: ${areaTri.toFixed(3)}`);
console.log(`CIRCULO: ${areaCir.toFixed(3)}`);
console.log(`TRAPEZIO: ${areaTra.toFixed(3)}`);
console.log(`QUADRADO: ${areaQua.toFixed(3)}`);
console.log(`RETANGULO: ${areaRet.toFixed(3)}`);