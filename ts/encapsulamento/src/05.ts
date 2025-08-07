import * as readlineSync from 'readline-sync'; 
import { Fahrenheit } from './entities/Fahrenheit.entity';

const celsius: number = Number(readlineSync.question("Digite a temperatura em graus Celsius: "));
const tempF: Fahrenheit = new Fahrenheit(celsius);

console.log(`Temperatura em graus Fahrenheit: ${tempF.celsiusToFahrenheit().toFixed(1)}`);