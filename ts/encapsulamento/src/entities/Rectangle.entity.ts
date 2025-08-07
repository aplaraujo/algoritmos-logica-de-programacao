export class Rectangle {
    private _width: number
    private _height: number

    constructor(width: number, height: number) {
        this._width = width;
        this._height = height;        
    }

    public get getWidth() {
        return this._width;
    }

    public set setWidth(width: number) {
        this._width = width;
    }

    public get getHeight() {
        return this._height;
    }

    public set setHeight(height: number) {
        this._height = height;
    }

    public area(): number {
        return this._width * this._height;
    }

    public perimeter(): number {
        return 2 * (this._width + this._height);
    }

    public diagonal(): number {
        return Math.sqrt(Math.pow(this._width, 2) + Math.pow(this._height, 2));
    }
}