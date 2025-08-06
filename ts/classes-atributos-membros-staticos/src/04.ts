import * as readlineSync from 'readline-sync';  
import { Employee } from './employee';

const name:string = readlineSync.question("Name: ");
const grossSalary: number = Number(readlineSync.question("Gross salary: "));
const tax: number = Number(readlineSync.question("Tax: "));

const employee: Employee = new Employee(name, grossSalary, tax);

console.log(`Employee: Joao Silva, $ ${employee.netSalary().toFixed(2)}`);

const percentage: number = Number(readlineSync.question("Which percentage to increase salary? "));
employee.increaseSalary(percentage);

console.log(`Updated data: Joao Silva, $ ${employee.netSalary().toFixed(2)}`);