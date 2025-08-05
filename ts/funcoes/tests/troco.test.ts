import {describe, expect, test} from '@jest/globals';
import { obterTroco } from '../src/troco';

describe("Troco", () => {
    test("Deve retornar 4.00", () => {
        const preco: number = 8.00;
        const quant: number = 2;
        const dinheiro: number = 20.00;
        const resultado: number = obterTroco(preco, quant, dinheiro);
        expect(resultado).toEqual(4.00);
    }),
    test("Deve retornar 10.00", () => {
        const preco: number = 30.00;
        const quant: number = 3;
        const dinheiro: number = 100.00;
        const resultado: number = obterTroco(preco, quant, dinheiro);
        expect(resultado).toEqual(10.00);
    })
})