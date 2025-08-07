import * as readlineSync from 'readline-sync'; 
import { EvenOdd } from './entities/EvenOdd.entity';

const value: number = Number(readlineSync.question());
const isEven:EvenOdd = new EvenOdd(value);
console.log(isEven.isEvenOrOdd());