const readline = require("readline-sync");

const temp = readline.question("Voce vai digitar a temperatura em qual escala (C/F)? ");

if (temp !== 'C' && temp !== 'F') {
    console.log("Opção inválida!!!");
} else {
    if (temp === 'F') {
        const tempF = Number(readline.question("Digite a temperatura em Fahrenheit: "));
        const tempC = ((tempF - 32) * 5) / 9;
        console.log(`Temperatura equivalente em Celsius: ${tempC.toFixed(2)}`);
    } else {
        const tempC = Number(readline.question("Digite a temperatura em Celsius: "));
        const tempF = tempC * (9 / 5) + 32;
        console.log(`Temperatura equivalente em Fahrenheit: ${tempF.toFixed(2)}`);
    }
}