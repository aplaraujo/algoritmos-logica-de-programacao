const readline = require('readline-sync');

let senha = Number(readline.question("Digite a senha: "));

do {
    if (senha !== 2002) {
        senha = Number(readline.question("Senha Invalida! Tente novamente: "));
    }
} while (senha !== 2002);

console.log("Acesso permitido!");