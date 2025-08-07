export class ShowLines {
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

    public show() {
        for (let i = 1; i <= this._value; i++) {
            console.log(`${i} ${i*i} ${i*i*i}`);
        }
    }
}