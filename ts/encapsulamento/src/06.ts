import * as readlineSync from 'readline-sync';  
import { Celsius } from './entities/Celsius.entity';

const tempF: number = Number(readlineSync.question("Digite a temperatura em graus Fahreneheit: "));
const celsius: Celsius = new Celsius(tempF);

console.log(`Temperatura em graus Celsius: ${celsius.fahrenheitToCelsius().toFixed(0)}`);