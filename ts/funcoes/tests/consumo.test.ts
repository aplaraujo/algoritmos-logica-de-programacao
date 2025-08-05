import {describe, expect, test} from '@jest/globals';
import {consumoMedio} from '../src/consumo';

describe("Consumo", () => {
    test("Deve retornar 12.987", () => {
        const distancia: number = 500;
        const combustivel: number = 38.5;
        const resultado: number = consumoMedio(distancia, combustivel);
        expect(resultado).toEqual(12.987);
    }),
    test("Deve retornar 15.518", () => {
        const distancia: number = 1108;
        const combustivel: number = 71.4;
        const resultado: number = consumoMedio(distancia, combustivel);
        expect(resultado).toEqual(15.518);
    })
})