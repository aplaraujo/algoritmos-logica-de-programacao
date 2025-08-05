import {describe, expect, test} from '@jest/globals';
import {duracao} from '../src/duracao';

describe("Duracao", () => {
    test("Deve retornar 0:5:0", () => {
        const segundos: number = 300;
        const resultado: string = duracao(segundos);
        expect(resultado).toEqual("0:5:0");
    }),
    test("Deve retornar 3:28:26", () => {
        const segundos: number = 12506;
        const resultado: string = duracao(segundos);
        expect(resultado).toEqual("3:28:26");
    }),
    test("Deve retornar 39:7:51", () => {
        const segundos: number = 140811;
        const resultado: string = duracao(segundos);
        expect(resultado).toEqual("39:7:51");
    })
})