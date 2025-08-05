import {describe, expect, test} from '@jest/globals';
import { mediaIdades } from "../src/idades";

describe("Media de idades", () => {
    test('Deve retornar 19.5 anos', () => { 
        const idade1:number = 19;
        const idade2:number = 20;
        const resultado:number = mediaIdades(idade1, idade2);
        expect(resultado).toEqual(19.5);
    }),
    test('Deve retornar 43.5 anos', () => { 
        const idade1:number = 67;
        const idade2:number = 20;
        const resultado:number = mediaIdades(idade1, idade2);
        expect(resultado).toEqual(43.5);
    })
})