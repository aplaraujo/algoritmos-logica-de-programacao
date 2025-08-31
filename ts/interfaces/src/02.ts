import { Sum } from './services/Sum.interface';
import * as readlineSync from 'readline-sync'; 
import { Value } from './entities/Value.entity';

const A: number = Number(readlineSync.question("Valor de A: "));
const B: number = Number(readlineSync.question("Valor de B: "));

const sum: Sum = new Value(A, B);

console.log(`Resultado da soma: ${sum.getSum(A, B)}`);