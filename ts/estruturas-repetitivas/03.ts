import * as readlineSync from 'readline-sync';   

const num: number = Number(readlineSync.question());

for (let i = 0; i < num; i++) {
    const n1:number = Number(readlineSync.question());
    const n2: number = Number(readlineSync.question());
    const n3: number = Number(readlineSync.question());
    const average:number = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
    console.log("Average = " + average.toFixed(1)); 
}