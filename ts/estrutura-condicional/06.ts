import * as readlineSync from 'readline-sync';   

const num:number = Number(readlineSync.question());

if (num >= 0 && num <= 25) {
    console.log("Intervalo [0,25]");
} else {
    if (num > 25 && num <= 50) {
        console.log("Intervalo (25,50]");
    } else {
        if (num > 50 && num <= 75) {
            console.log("Intervalo (50,75]");
        } else {
            if (num > 75 && num <= 100) {
                console.log("Intervalo (75,100]");
            } else {
                console.log("Fora de intervalo");
            }
        }
    }
}