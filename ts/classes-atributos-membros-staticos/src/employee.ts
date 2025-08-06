export class Employee {
    name: string
    grossSalary: number
    tax: number

    constructor(name: string, grossSalary: number, tax: number) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    netSalary() {
        return this.grossSalary - this.tax;
    }

    increaseSalary(percentage: number): void {
        this.grossSalary += this.grossSalary * (percentage / 100);
    }
}