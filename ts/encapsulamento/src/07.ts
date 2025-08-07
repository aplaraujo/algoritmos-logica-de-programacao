import * as readlineSync from 'readline-sync'; 
import { Negative } from './entities/Negative.entity';

const value: number = Number(readlineSync.question());
const negative:Negative = new Negative(value);

console.log(negative.isNegative());