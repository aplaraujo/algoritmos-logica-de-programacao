import { Employee } from "./Employee.entity";

export class OutsorcedEmployee extends Employee{
    private _additionalCharge: number;

    constructor(name: string, hours: number, valuePerHour: number, additionalCharge: number) {
        super(name, hours, valuePerHour);
        this._additionalCharge = additionalCharge;
    }

    public getAdditionalCharge() {
        return this._additionalCharge;
    }

    public setAdditionalCharge(additionalCharge: number) {
        this._additionalCharge = additionalCharge;
    }

    public payment(): number {
        return this.getHours() * this.getValuePerHour() + this._additionalCharge * 1.1;
    }
}