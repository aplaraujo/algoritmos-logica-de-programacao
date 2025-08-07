export class Celsius {
    private _tempF: number

    constructor(tempF: number) {
        this._tempF = tempF;
    }

    public get getTempF() {
        return this._tempF;
    }

    public set setTempF(tempF: number) {
        this._tempF = tempF;
    }

    public fahrenheitToCelsius() {
        return ((this._tempF - 32) * 5) / 9;
    }
}