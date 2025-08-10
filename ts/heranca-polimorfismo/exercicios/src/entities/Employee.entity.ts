export class Employee {
    private _name: string
    private _hours: number
    private _valuePerHour: number

    constructor(name: string, hours: number, valuePerHour: number) {
        this._name = name;
        this._hours = hours;
        this._valuePerHour = valuePerHour;
    }

    public getName() {
        return this._name;
    }

    public setName(name: string) {
        this._name = name;
    }

    public getHours() {
        return this._hours;
    }

    public setHours(hours: number) {
        this._hours = hours;
    }

    public getValuePerHour() {
        return this._valuePerHour;
    }

    public setValuePerHour(valuePerHour: number) {
        this._valuePerHour = valuePerHour;
    }

    public payment(): number {
        return this._hours * this._valuePerHour;
    }
 }