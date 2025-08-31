export class Invoice {
    private basicPayment: number;
    private tax: number;

    constructor(basicPayment: number, tax: number) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    public getBasicPayment(): number {
        return this.basicPayment;
    }

    public setBasicPayment(basicPayment: number): void {
        this.basicPayment = basicPayment;
    }

    public getTax(): number {
        return this.tax;
    }

    public setTax(tax: number): void {
        this.tax = tax;
    }

    public getTotalPayment(): number {
        return this.basicPayment + this.tax;
    }
}