export class Rectangle {
    width: number
    height: number

    constructor(width: number, height: number) {
        this.width = width;
        this.height = height;
    }

    area() {
        return this.width * this.height;
    }    

    perimeter() {
        return 2 * (this.width + this.height);
    }

    diagonal() {
        return Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
    }
}