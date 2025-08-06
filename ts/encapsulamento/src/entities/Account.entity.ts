export class Account {
    private _number: number
    private _holder: string
    private _balance: number

    constructor(number: number, holder: string, balance: number = 0) {
        this._number = number;
        this._holder = holder;
        this._balance = balance;
    }

    public get getNumber() {
        return this._number;
    }

    public get getHolder() {
        return this._holder;
    }

    public set setHolder(holder: string) {
        this._holder = holder;
    }

    public get getBalance() {
        return this._balance;
    }

    public deposit(amount: number): void {
        this._balance += amount;
    }

    public withdraw(amount: number): void {
        this._balance -= amount + 5;
    }
}