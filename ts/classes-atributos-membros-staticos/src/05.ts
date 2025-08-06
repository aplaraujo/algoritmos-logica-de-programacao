import * as readlineSync from 'readline-sync';  
import { Student } from './student';

const name: string = readlineSync.question();
const g1: number = Number(readlineSync.question());
const g2: number = Number(readlineSync.question());
const g3: number = Number(readlineSync.question());

const student: Student = new Student(name, g1, g2, g3);

const finalGrade = student.finalGrade();

console.log(`FINAL GRADE = ${finalGrade.toFixed(2)}`);

const passOrFail = finalGrade >= 60 ? "PASS" : `FAILED 
MISSING ${60 - finalGrade} POINTS`;

console.log(passOrFail);