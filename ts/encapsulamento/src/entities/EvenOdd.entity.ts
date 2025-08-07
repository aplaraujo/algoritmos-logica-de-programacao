export class EvenOdd {
    private _value: number

    constructor(value: number) {
        this._value = value;
    }

    public get getValue() {
        return this._value;
    }

    public set setValue(value: number) {
        this._value = value;
    }

    public isEvenOrOdd() {
        return this._value % 2 === 0 ? "PAR" : "IMPAR";
    }
}