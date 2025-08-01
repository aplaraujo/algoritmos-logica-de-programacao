import * as readlineSync from 'readline-sync';   

const num: number = Number(readlineSync.question());

let numInt: number = 0;
let numOut:number = 0;

for (let i = 0; i < num; i++) {
    const value: number = Number(readlineSync.question());

    if (value >= 10 && value <= 20) {
        numInt++;
    } else {
        numOut++;
    }
}

console.log(`${numInt} in`);
console.log(`${numOut} out`);