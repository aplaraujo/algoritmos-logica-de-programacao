import * as readlineSync from 'readline-sync';  
import { CurrencyConverter } from './currencyConverter';

const dollarPrice: number = Number(readlineSync.question("What is the dollar price? "));
const dollar: number = Number(readlineSync.question("How many dollars will be bought? "));
const real: number = CurrencyConverter.dollarToReal(dollarPrice, dollar);

console.log(`Amount to be paid in reais = ${real.toFixed(2)}`);