import { Department } from "./Department.entity";
import { HourContract } from "./HourContract.entity";
import { WorkerLevel } from "./WorkerLevel.enum";

export class Worker {
    private name: string;
    private level: WorkerLevel;
    private baseSalary: number;
    private department: Department;
    private contracts: HourContract[];

    constructor(name: string, level: WorkerLevel, baseSalary: number, department: Department, contracts: HourContract[]) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
        this.contracts = [];
    }

    public getName(): string {
        return this.name;
    }

    public getLevel(): WorkerLevel {
        return this.level;
    }

    public getBaseSalary(): number {
        return this.baseSalary;
    }

    public getDepartment(): Department {
        return this.department;
    }

    public getContracts(): HourContract[] {
        return this.contracts;
    }

    public addContract(contract: HourContract): void {
        this.contracts.push(contract);
    }

    public removeContract(contract: HourContract): void {
        const index = this.contracts.indexOf(contract);
        if (index !== -1) {
            this.contracts.splice(index, 1);
        }
    }

    public income(year: number, month: number): number {
        let sum = this.getBaseSalary();

        for (let contract of this.contracts) {
            const contractDate = contract.getDate();
            const contractYear = contractDate.getFullYear();
            const contractMonth = contractDate.getMonth() + 1; // getMonth() é de 0 a 11

            if (contractYear === year && contractMonth === month) {
                sum += contract.totalValue();
            }
        }

        return sum;
    }
}