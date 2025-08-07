export class Negative {
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

    public isNegative() {
        return this._value < 0 ? "NEGATIVO" : "NAO NEGATIVO";
    }
}