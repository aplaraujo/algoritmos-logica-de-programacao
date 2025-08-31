import * as readlineSync from 'readline-sync'; 
import { Rectangle } from './entities/Rectangle.entity';
import { IShape } from './services/Shape.interface';

const width: number = Number(readlineSync.question("Base do retangulo: "));
const height: number = Number(readlineSync.question("Altura do retangulo: "));

const area: IShape = new Rectangle(width, height);
const perimeter: IShape = new Rectangle(width, height);
const diagonal: IShape = new Rectangle(width, height);

console.log(`AREA = ${area.getArea(width, height).toFixed(4)}`);
console.log(`PERIMETRO = ${perimeter.getPerimeter(width, height).toFixed(4)}`);
console.log(`DIAGONAL = ${diagonal.getDiagonal(width, height).toFixed(4)}`);