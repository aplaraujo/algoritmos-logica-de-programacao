import * as readlineSync from 'readline-sync';   

const num: number = Number(readlineSync.question());

for (let i = 1; i <= num; i++) {
    console.log(`${i} ${i*i} ${i*i*i}`);
}