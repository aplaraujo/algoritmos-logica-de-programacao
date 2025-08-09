export class Account {
    private _number: number
    private _holder: string
    protected _balance: number

    constructor(number: number, holder: string, balance: number) {
        this._number = number;
        this._holder = holder;
        this._balance = balance; 
    }

    public getNumber() {
        return this._number;
    }

    public setNumber(number: number) {
        this._number = number;
    }

    public getHolder() {
        return this._holder;
    }

    public setHolder(holder: string) {
        this._holder = holder;
    }

    public getBalance() {
        return this._balance;
    }

    public setBalance(balance: number) {
        this._balance = balance;
    }

    public withdraw(amount: number): void {
        this._balance -= amount + 5.00;
    }

    public deposit(amount: number): void {
        this._balance += amount;
    }
}