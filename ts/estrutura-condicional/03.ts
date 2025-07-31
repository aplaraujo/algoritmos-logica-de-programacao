import * as readlineSync from 'readline-sync';   

const a: number = Number(readlineSync.question());
const b: number = Number(readlineSync.question());

if (a > b) {
    if (a % b === 0) {
        console.log("Sao Multiplos");
    } else {
        console.log("Nao sao Multiplos");
    }
} else {
    if (b % a === 0) {
        console.log("Sao Multiplos");
    } else {
        console.log("Nao sao Multiplos");
    }
}