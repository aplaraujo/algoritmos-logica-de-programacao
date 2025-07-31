import * as readlineSync from 'readline-sync';   

const start: number = Number(readlineSync.question());
const end: number = Number(readlineSync.question());
let total:number;

if (end === start) {
    total = 24;
} else {
    if (end < start) {
        total = (24 - start) + end;
    } else {
        total = end - start;
    }
}

console.log(`O JOGO DUROU ${total} HORA(S)`);