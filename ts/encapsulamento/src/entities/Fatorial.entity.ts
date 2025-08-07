export class Fatorial {
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

    public getFatorial() {
        let fat = 1;
        for(let i = 1; i <= this._value; i++) {
            fat = fat * i;
        }
        return fat;
    }
}