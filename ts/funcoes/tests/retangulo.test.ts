import {describe, expect, test} from '@jest/globals';
import { area, perimetro, diagonal } from "../src/retangulo";

describe("Area, perimetro e diagonal de um retangulo", () => {
    test("Deve retornar 20.0000 de area, 18.0000 de perimetro e 6.4031 de diagonal", () => {
        const base: number = 4.0;
        const altura: number = 5.0;
        const areaRet: number = area(base, altura);
        const periRet: number = perimetro(base, altura);
        const diagRet: number = diagonal(base, altura);
        expect(areaRet).toEqual(20.0000);
        expect(periRet).toEqual(18.0000);
        expect(diagRet).toEqual(6.4031);
    }),

    test("Deve retornar 134.9300 de area, 46.8000 de perimetro e 16.6643 de diagonal", () => {
        const base: number = 10.3;
        const altura: number = 13.1;
        const areaRet: number = area(base, altura);
        const periRet: number = perimetro(base, altura);
        const diagRet: number = diagonal(base, altura);
        expect(areaRet).toEqual(134.9300);
        expect(periRet).toEqual(46.8000);
        expect(diagRet).toEqual(16.6643);
    })
})