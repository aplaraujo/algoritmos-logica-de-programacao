import { Account } from "./Account.entity";

export class SavingsAccount extends Account {
    private _interestRate: number
    
    constructor(number: number, holder: string, balance: number, interestRate: number) {
        super(number, holder, balance);
        this._interestRate = interestRate;
    }

    public getInterestRate() {
        return this._interestRate;
    }

    public setInterestRate(interestRate: number) {
        this._interestRate = interestRate;
    }

    public updateBalance(): void {
        this._balance += this._balance * this._interestRate;
    }

    public withdraw(amount: number): void {
        this._balance -= amount;
    }
}