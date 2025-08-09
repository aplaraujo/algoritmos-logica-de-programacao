import { Account } from "./Account.entity";

export class BusinessAccount extends Account {
    private _loanLimit: number
    constructor(number: number, holder: string, balance: number, loanLimit: number) {
        super(number, holder, balance);
        this._loanLimit = loanLimit;
    }

    public getLoanLimit() {
        return this._loanLimit;
    }

    public setLoanLimit(loanLimit: number) {
        this._loanLimit = loanLimit;
    }

    public loan(amount: number): void {
        if (amount <= this._loanLimit) {
            this._balance += amount - 10.0;
        }
    }

    public withdraw(amount: number): void {
        super.withdraw(amount);
        this._balance -= 2.0;
    }
}