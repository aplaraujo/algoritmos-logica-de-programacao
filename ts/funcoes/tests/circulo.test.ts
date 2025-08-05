import {describe, expect, test} from '@jest/globals';
import { areaCirculo } from '../src/circulo';

describe("Area do circulo", () => {
    test("Deve retornar 12.566", () => {
        const raio: number = 2.0;
        const resultado: number = areaCirculo(raio);
        expect(resultado).toEqual(12.566);
    })
})