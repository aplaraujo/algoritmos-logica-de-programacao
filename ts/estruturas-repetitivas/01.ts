import * as readlineSync from 'readline-sync';   

const num: number = Number(readlineSync.question());

for (let i = 1; i <= num; i++) {
    if (i % 2 !== 0) {
        console.log(i);
    }
}