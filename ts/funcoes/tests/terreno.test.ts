import {describe, expect, test} from '@jest/globals';
import { area, preco } from "../src/terreno";

describe("Area e preco do terreno", () => {
    test("Deve retornar 300.00 de area do terreno e 60000.00 de preco do terreno", () => {
        const largura: number = 10.0;
        const comp:number = 30.0;
        const metro:number = 200.00;
        const areaTerreno:number = area(largura, comp);
        const precoTerreno:number = preco(areaTerreno, metro);
        expect(areaTerreno).toEqual(300.00);
        expect(precoTerreno).toEqual(60000.00);
    })

    test("Deve retornar 240.00 de area do terreno e 36000.00 de preco do terreno", () => {
        const largura: number = 12.0;
        const comp:number = 20.0;
        const metro:number = 150.00;
        const areaTerreno:number = area(largura, comp);
        const precoTerreno:number = preco(areaTerreno, metro);
        expect(areaTerreno).toEqual(240.00);
        expect(precoTerreno).toEqual(36000.00);
    })
})