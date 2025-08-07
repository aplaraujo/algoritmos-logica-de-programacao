import * as readlineSync from 'readline-sync'; 
import { ShowLines } from './entities/ShowLines.entity';

const value: number = Number(readlineSync.question());
const show:ShowLines = new ShowLines(value);
show.show();