import { randomBytes } from "crypto";
import { Color } from "../enums/Color.enum";
import { Shape } from "./Shape.entity";

export class Circle extends Shape {
    private _radius: number;
    constructor(color: Color, radius: number) {
        super(color);
        this._radius = radius;
    }

    get getRadius() {
        return this._radius;
    }

    set setRadius(radius: number) {
        this._radius = radius;
    }

    public area() {
        return Number((Math.PI * Math.pow(this._radius, 2)).toFixed(2));
    }
}