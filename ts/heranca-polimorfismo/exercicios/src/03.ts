import * as readlineSync from 'readline-sync';  
import { Shape } from './entities/Shape.entity';
import { Rectangle } from './entities/Rectangle.entity';
import { Color } from './enums/Color.enum';
import { Circle } from './entities/Circle.entity';

const N: number = Number(readlineSync.question("Enter the number of shapes: "));

const shapes: Shape[] = [];

for (let i = 1; i <= N; i++) {
    console.log(`Shape #${i} data:`);
    const response: string = readlineSync.question("Rectangle or Circle (r/c)? ");
    const color: string = readlineSync.question("Color (BLACK/BLUE/RED): ");
    if (response === 'r') {
        const width: number = Number(readlineSync.question("Width: "));
        const height: number = Number(readlineSync.question("Height: "));
        const colorEnum: Color = Color[color as keyof typeof Color];
        const rectangle: Rectangle = new Rectangle(colorEnum, width, height);
        shapes.push(rectangle);
    } else {
        const radius: number = Number(readlineSync.question("Radius: "));
        const colorEnum: Color = Color[color as keyof typeof Color];
        const circle: Circle = new Circle(colorEnum, radius);
        shapes.push(circle);
    }
}

console.log("SHAPE AREAS:");
const areas = shapes.map(shape => shape.area());

areas.forEach(area => {
    console.log(area);
});