import * as readlineSync from 'readline-sync';   

const salario:number = Number(readlineSync.question());

if (salario <= 2000.00) {
    console.log("Isento");
}

if (salario > 2000.00 && salario <= 3000.00) {
    console.log(`R$ ${((salario - 2000.00) * 0.08).toFixed(2)}`);
}

if (salario > 3000.00 && salario <= 4500.00) {
    console.log(`R$ ${(((salario - 3000) * 0.18) + 80.00).toFixed(2)}`);
}

if (salario > 4500.00) {
    console.log(`R$ ${(((salario - 4500) * 0.28) + 350.00).toFixed(2)}`);
}