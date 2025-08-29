import * as readlineSync from 'readline-sync'; 
import { Department } from './entities/Department.entity';
import { Worker } from './entities/Worker.entity';
import { WorkerLevel } from './entities/WorkerLevel.enum';
import { HourContract } from './entities/HourContract.entity';

const department = "Design";
const dep: Department = new Department(department);
const name = "Alex";
const level = "MID_LEVEL";
const workerLevel = level as WorkerLevel;
const baseSalary = 1200.00;
const contracts: HourContract[] = [];

const wk = new Worker(name, workerLevel, baseSalary, dep, contracts);

wk.addContract(new HourContract(new Date(2018, 7, 20), 50.00, 20)); // 1000
wk.addContract(new HourContract(new Date(2018, 5, 13), 30.00, 18)); // Ignorado (junho)
wk.addContract(new HourContract(new Date(2018, 7, 25), 80.00, 10)); // 800

console.log(wk.income(2018, 8)); // Agosto (mês 8)