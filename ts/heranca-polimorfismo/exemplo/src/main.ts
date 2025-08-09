import { BusinessAccount } from "./entities/BusinessAccount.entity";
import { SavingsAccount } from "./entities/SavingsAccount.entity";

const x: BusinessAccount = new BusinessAccount(1001, "Joao", 1000.00, 100.00);
const y: SavingsAccount = new SavingsAccount(1002, "Maria", 1000.00, 0.01);

x.withdraw(200.00);
y.withdraw(200.00);

console.log("-------------------------------------------");
console.log(`Saldo Joao: ${x.getBalance().toFixed(2)}`);
console.log(`Saldo Maria: ${y.getBalance().toFixed(2)}`);
console.log("-------------------------------------------");