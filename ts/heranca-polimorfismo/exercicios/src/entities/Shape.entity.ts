import { Color } from "../enums/Color.enum";

export class Shape {
    private _color: Color
    constructor(color: Color) {
        this._color = color;
    }

    get getColor() {
        return this._color;
    }

    set setColor(color: Color) {
        this._color = color;
    }

    public area() {}
}