export class CurrencyConverter {
    public static IOF: number = 0.06;

    public static dollarToReal(amount: number, dollarPrice: number): number {
        return amount * dollarPrice * (1.0 + this.IOF);
    }
}