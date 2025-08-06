import * as readlineSync from 'readline-sync'; 
import { Account } from './entities/Account.entity';

const number: number = Number(readlineSync.question("Enter account number: "));
const holder: string = readlineSync.question("Enter account holder: ");
const response:string = readlineSync.question("Is there na initial deposit (y/n)? ");
let initialBalance: number = 0;
let account: Account;

if (response === 'y') {
    initialBalance = Number(readlineSync.question("Enter initial deposit value: "));
    account = new Account(number, holder, initialBalance);
} else {
    account = new Account(number, holder);
}

console.log();
console.log("Account data:");
console.log(`Account ${account.getNumber}, Holder: ${account.getHolder}, Balance: $ ${account.getBalance.toFixed(2)}`);


const amountToDeposit: number = Number(readlineSync.question("Enter a deposit value: "));
account.deposit(amountToDeposit);

console.log("Updated account data: ");
console.log(`Account ${account.getNumber}, Holder: ${account.getHolder}, Balance: $ ${account.getBalance.toFixed(2)}`);

const amountToWithdraw: number = Number(readlineSync.question("Enter a withdraw value: "));
account.withdraw(amountToWithdraw);

console.log("Updated account data: ");
console.log(`Account ${account.getNumber}, Holder: ${account.getHolder}, Balance: $ ${account.getBalance.toFixed(2)}`);