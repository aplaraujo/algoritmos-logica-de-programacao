export class Fahrenheit {
    private _tempC: number

    constructor(tempC: number) {
        this._tempC = tempC;
    }

    public get getTempC() {
        return this._tempC;
    }

    public set setTempC(tempC: number) {
        this._tempC = tempC;
    } 

    public celsiusToFahrenheit() {
        return (this._tempC * (9 / 5)) + 32;
    }
}