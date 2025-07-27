const readline = require("readline-sync");

const glicose = Number(readline.question("Digite a medida da glicose: "));

if (glicose <= 100) {
   console.log("Classificacao: normal"); 
} else {
    if (glicose > 100 && glicose <= 140) {
        console.log("Classificacao: elevado"); 
    } else {
        console.log("Classificacao: diabetes"); 
    }
}