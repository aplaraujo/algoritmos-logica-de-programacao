import * as readlineSync from 'readline-sync';  
import {Triangle} from './triangle';

console.log("Enter the measures of triangle X:");
const xA: number = Number(readlineSync.question());
const xB: number = Number(readlineSync.question());
const xC: number = Number(readlineSync.question());

console.log("Enter the measures of triangle Y:");
const yA: number = Number(readlineSync.question());
const yB: number = Number(readlineSync.question());
const yC: number = Number(readlineSync.question());

const X: Triangle = new Triangle(xA, xB, xC);
const Y: Triangle = new Triangle(yA, yB, yC);

const areaX: number = X.area();
const areaY: number = Y.area();

console.log(`Triangle X area: ${areaX.toFixed(4)}`);
console.log(`Triangle Y area: ${areaY.toFixed(4)}`);
const largestArea = (areaX > areaY) ? console.log(`Larger area: X`) : console.log(`Larger area: Y`); 
largestArea;