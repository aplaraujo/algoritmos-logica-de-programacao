const readline = require('readline-sync');

const A = Number(readline.question("Digite a medida A: "));
const B = Number(readline.question("Digite a medida B: "));
const C = Number(readline.question("Digite a medida C: "));
const areaQuadrado = A * A;
const areaTriangulo = (A * B) / 2;
const areaTrapezio = ((A + B) * C) / 2;

console.log(`AREA DO QUADRADO = ${areaQuadrado.toFixed(4)}`);
console.log(`AREA DO TRIANGULO = ${areaTriangulo.toFixed(4)}`);
console.log(`AREA DO TRAPEZIO = ${areaTrapezio.toFixed(4)}`);