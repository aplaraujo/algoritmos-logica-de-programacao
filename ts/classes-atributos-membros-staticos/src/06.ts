import * as readlineSync from 'readline-sync';  
import { Calculator } from './calculator'; 

const radius: number = Number(readlineSync.question("Enter radius: "));

const c: number = Calculator.circumference(radius);

const v: number = Calculator.volume(radius);

console.log(`Circumference: ${c.toFixed(2)}`);
console.log(`Volume: ${v.toFixed(2)}`);
console.log(`PI value: ${Calculator.pi.toFixed(2)}`);