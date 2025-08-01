import * as readlineSync from 'readline-sync';   

const divExata = (dividendo: number, divisor: number) => dividendo % divisor === 0;

const numPrimo = (num: number) => {
    const div = [];
    let qtdDiv = 0;
    for (let i = 1; i <= num; i++) {
        if (divExata(num, i)) {
            div.push(i)
            qtdDiv++
        }
    }

    for (let i = 0; i < div.length; i++) {
        console.log(div[i])
    }
}

const num: number = Number(readlineSync.question());

numPrimo(num);