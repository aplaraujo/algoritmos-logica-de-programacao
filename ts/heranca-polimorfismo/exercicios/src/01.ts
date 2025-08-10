import { Employee } from './entities/Employee.entity';
import * as readlineSync from 'readline-sync';  
import { OutsorcedEmployee } from './entities/OutsourcedEmployee.entity';

const N: number = Number(readlineSync.question("Enter the number of employees: "));
const employees: Employee[] = [];

for (let i = 1; i <= N; i++) {
    console.log(`Employee #${i} data:`);
    const response: string = readlineSync.question("Outsourced (y/n)? ");
    const name: string = readlineSync.question("Name: ");
    const hours: number = Number(readlineSync.question("Hours: "));
    const valuePerHour: number = Number(readlineSync.question("Value per hour: "));

    if (response === 'y') {
        const additionalCharge: number = Number(readlineSync.question("Additional charge: "));
        const emp: OutsorcedEmployee = new OutsorcedEmployee(name, hours, valuePerHour, additionalCharge);
        employees.push(emp);
    } else {
        const emp: Employee = new Employee(name, hours, valuePerHour);
        employees.push(emp);
    }
}

console.log("\nPAYMENTS:");
const people = employees.map(emp => ({
  name: emp.getName(),
  payment: emp.payment(),
}));

people.forEach(p => {
  console.log(`${p.name} - $${p.payment.toFixed(2)}`);
});

/*
interface PessoaSalario {
  nome: string;
  salario: number;
}

const people: PessoaSalario[] = employees.map(emp => ({
  nome: emp.getName(),
  salario: emp.payment(),
}));
*/