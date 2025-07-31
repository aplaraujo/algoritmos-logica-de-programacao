import * as readlineSync from 'readline-sync';   

const num: number = Number(readlineSync.question());

if (num < 0) {
    console.log("NEGATIVO");
} else {
    console.log("NAO NEGATIVO");
}