export class HourContract {
    private date: Date;
    private valuePerHour: number;
    private hours: number;

    constructor(date: Date, valuePerHour: number, hours: number) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public getDate(): Date {
        return this.date;
    }

    public setDate(date: Date) {
        this.date = date;
    }

    public getValuePerHour(): number {
        return this.valuePerHour;
    }

    public setValuePerHour(valuePerHour: number) {
        this.valuePerHour = valuePerHour;
    }

    public getHours(): number {
        return this.hours;
    }

    public setHours(hours: number) {
        this.hours = hours;
    }

    public totalValue(): number {
        return this.getHours() * this.getValuePerHour();
    }
}