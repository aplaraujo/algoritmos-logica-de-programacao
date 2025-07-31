import * as readlineSync from 'readline-sync';   
const num: number = Number(readlineSync.question());

if (num % 2 === 0) {
    console.log("PAR");
} else {
    console.log("IMPAR");
}