import * as readlineSync from 'readline-sync';   

const X: number = Number(readlineSync.question());
const Y: number = Number(readlineSync.question());

if (X > 0 && Y > 0) {
    console.log("Q1");
}

if (X < 0 && Y > 0) {
    console.log("Q2");
}

if (X < 0 && Y < 0) {
    console.log("Q3");
}

if (X > 0 && Y < 0) {
    console.log("Q4");
}

if (X > 0 && Y === 0) {
    console.log("Eixo X");
}

if (X < 0 && Y === 0) {
    console.log("Eixo X");
}

if (X === 0 && Y > 0) {
    console.log("Eixo Y");
}

if (X === 0 && Y < 0) {
    console.log("Eixo Y");
}

if (X === 0 && Y === 0) {
    console.log("Origem");
}