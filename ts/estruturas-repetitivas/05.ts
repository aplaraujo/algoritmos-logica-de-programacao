import * as readlineSync from 'readline-sync';   

let fat: number = 1;
const num: number = Number(readlineSync.question());

for (let i = 1; i <= num; i++) {
    fat *= i;
}

console.log(fat);