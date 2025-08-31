export class Vehicle {
    private model: string;

    constructor(model: string) {
        this.model = model;
    }

    public getModel(): string {
        return this.model;
    }

    public setModel(model: string): void {
        this.model = model;
    }
}