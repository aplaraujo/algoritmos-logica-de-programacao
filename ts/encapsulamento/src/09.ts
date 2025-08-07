import * as readlineSync from 'readline-sync'; 
import { Fatorial } from './entities/Fatorial.entity';

const value: number = Number(readlineSync.question());
const fat:Fatorial = new Fatorial(value);

console.log(fat.getFatorial());