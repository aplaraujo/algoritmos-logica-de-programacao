import * as readlineSync from 'readline-sync';   

const name = readlineSync.question('Please enter your name: ');
console.log(`Hello, ${name}! Welcome to our application.`);   