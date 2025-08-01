import * as readlineSync from 'readline-sync';  

const getDivision = (a: number, b: number) => {
    let div = a / b;
    return (a > 0 && b === 0) || (a < 0 && b === 0) ? "divisao impossivel" : div.toFixed(1);
}

const num: number = Number(readlineSync.question());

for (let i = 0; i < num; i++) {
    const num1: number = Number(readlineSync.question());
    const num2: number = Number(readlineSync.question());

    console.log(getDivision(num1, num2));
}