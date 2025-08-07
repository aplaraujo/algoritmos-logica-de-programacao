import * as readlineSync from 'readline-sync'; 
import { Person } from './entities/Person.entity';

const name: string = readlineSync.question("Digite o nome da pessoa: ");
const gender: string = readlineSync.question("Digite o sexo da pessoa: ");
const person:Person = new Person(name, gender);

console.log(`${person.getName}, ${person.getGender}`);