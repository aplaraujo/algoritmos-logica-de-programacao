import {describe, expect, test} from '@jest/globals';
import { soma } from "../src/soma";

describe("Soma", () => {
    test("Deve retornar 18", () => {
        const num1: number = 8;
        const num2: number = 10;
        const resultado: number = soma(num1, num2);
        expect(resultado).toEqual(18);
    }),
    test("Deve retornar 43", () => {
        const num1: number = 12;
        const num2: number = 31;
        const resultado: number = soma(num1, num2);
        expect(resultado).toEqual(43);
    })
})