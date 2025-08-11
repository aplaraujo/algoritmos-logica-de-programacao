import { Color } from "../enums/Color.enum";
import { Shape } from "./Shape.entity";

export class Rectangle extends Shape {
    private _width: number
    private _height: number

    constructor(color: Color, width: number, height: number) {
        super(color);
        this._width = width;
        this._height = height;
    }

    get getWidth() {
        return this._width;
    }

    set setWidth(width: number) {
        this._width = width;
    }

    get getHeight() {
        return this._height;
    }

    set setHeight(height: number) {
        this._height = height;
    }

    public area() {
        return Number((this._height * this._width).toFixed(2));
    }
}