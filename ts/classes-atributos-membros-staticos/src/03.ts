import * as readlineSync from 'readline-sync';  
import { Rectangle } from './rectangle';

console.log("Enter rectangle width and height:");
const width: number = Number(readlineSync.question());
const height: number = Number(readlineSync.question());

const rectangle: Rectangle = new Rectangle(width, height);

console.log(`AREA = ${rectangle.area().toFixed(2)}`);
console.log(`PERIMETER = ${rectangle.perimeter().toFixed(2)}`);
console.log(`DIAGONAL = ${rectangle.diagonal().toFixed(2)}`);