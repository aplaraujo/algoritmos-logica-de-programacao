export class Rectangle {
    private width: number;
    private height: number;

    constructor(width: number, height: number) {
        this.width = width;
        this.height = height;
    }

    public getWidth(): number {
        return this.width;
    }

    public setWidth(width: number) {
        this.width = width;
    }

    public getHeight(): number {
        return this.height;
    }

    public setHeight(height: number) {
        this.height = height;
    }

    public getArea() {
        return this.getWidth() * this.getHeight();
    }

    public getPerimeter() {
        return 2 * (this.getWidth() + this.getHeight());
    }

    public getDiagonal() {
        return Math.sqrt(Math.pow(this.getWidth(), 2) + Math.pow(this.getHeight(), 2));
    }
}